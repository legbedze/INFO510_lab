/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package twinklestars;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author H_Kofi
 */
public class TwinkleStars {

    private static final Object lock = new Object();  
    private static int turn = 1; // 1 for Thread 1, 2 for Thread 2  

    public static void main(String[] args) {  
        Thread thread1 = new Thread(() -> {  
            // Play the sequence for Thread 1  
            playTone("do.wav");  
            System.out.println("do.wav");  
            waitForTurn(2);  
            playTone("mi.wav");  
            System.out.println("mi.wav");  
            waitForTurn(2);  
            playTone("sol.wav");  
            System.out.println("sol.wav");  
            waitForTurn(2);  
            playTone("si.wav");  
            System.out.println("si.wav");  
            waitForTurn(2);  
            playTone("si.wav"); // si again  
            System.out.println("si.wav");  
            playTone("do-octave.wav");  
            System.out.println("do-octave.wav");  
        });  

        Thread thread2 = new Thread(() -> {  
            // Play the sequence for Thread 2  
            waitForTurn(1);  
            playTone("re.wav");  
            System.out.println("re.wav");  
            waitForTurn(1);  
            playTone("fa.wav");  
            System.out.println("fa.wav");  
            waitForTurn(1);  
            playTone("la.wav");  
            System.out.println("la.wav");  
            waitForTurn(1);  
            playTone("la.wav"); // la again  
            playTone("do-octave.wav");  
            System.out.println("do-octave.wav");  
        });  

        // Start the threads  
        thread1.start();  
        thread2.start();  
        
        try {  
            thread1.join();  
            thread2.join();  
        } catch (InterruptedException e) {  
            Thread.currentThread().interrupt();  
        }  
        
        // Play the complete song by coordinating both threads  
        playTwinkleTwinkle();  
    }  

    private static void playTwinkleTwinkle() {  
        playTone("do.wav");  
        System.out.println("do.wav");  
        playTone("do.wav");  
        System.out.println("do.wav");  
        waitForTurn(2);  
        playTone("so.wav");  
        System.out.println("so.wav");  
        waitForTurn(2);  
        playTone("so.wav");  
        System.out.println("so.wav");  
        waitForTurn(2);  
        playTone("la.wav");  
        System.out.println("la.wav");  
        waitForTurn(2);  
        playTone("la.wav");  
        System.out.println("la.wav");  
        waitForTurn(2);  
        playTone("so.wav");  
        System.out.println("so.wav");  
        waitForTurn(2);  
        playTone("fa.wav");  
        System.out.println("fa.wav");  
        waitForTurn(2);  
        playTone("fa.wav");  
        System.out.println("fa.wav");  
        waitForTurn(2);  
        playTone("mi.wav");  
        System.out.println("mi.wav");  
        waitForTurn(2);  
        playTone("mi.wav");  
        System.out.println("mi.wav");  
        waitForTurn(2);  
        playTone("re.wav");  
        System.out.println("re.wav");  
        waitForTurn(2);  
        playTone("re.wav");  
        System.out.println("re.wav");  
        waitForTurn(2);  
        playTone("do.wav");  
        System.out.println("do.wav");  
    }  

    private static void waitForTurn(int myTurn) {  
        synchronized (lock) {  
            while (turn != myTurn) {  
                try {  
                    lock.wait();  
                } catch (InterruptedException e) {  
                    Thread.currentThread().interrupt();  
                }  
            }  
        }   
        synchronized (lock) {  
            turn = myTurn == 1 ? 2 : 1; // change turn for the other thread  
            lock.notify();  
        }  
    }  

    private static void playTone(String toneFile) {  
        String filePath = "D:\\NORTHEASTERN\\COURSES\\Application Engineering and Development_INFO 5100\\INFO5100 LAB\\Thread\\Assignment5\\TwinkleStars\\src\\twinklestars\\" + toneFile;  

        try {  
            File soundFile = new File(filePath);  
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);  
            Clip clip = AudioSystem.getClip();  
            clip.open(audioInputStream);  
            clip.start(); // Start playing  

            // Wait for the clip to finish playing  
            clip.addLineListener(event -> {  
                if (event.getType() == LineEvent.Type.STOP) {  
                    clip.close();  
                }  
            });  

            // Keep the thread alive while the sound plays  
            while (clip.isRunning()) {  
                Thread.sleep(900); // Adjust as needed  
            }  

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {  
            e.printStackTrace(); // Handle the exception (e.g., log it)  
        }  
    }  
}

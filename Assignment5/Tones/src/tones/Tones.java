/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tones;

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
public class Tones {

    private static final Object lock = new Object();  
    private static int turn = 1; // 1 for Thread 1, 2 for Thread 2  

    public static void main(String[] args) {  
        Thread thread1 = new Thread(() -> {  
            playTone("do.wav");
            System.out.println("do.wav");
            synchronized (lock) {  
                turn = 2;   
                lock.notify();   
                try {  
                    lock.wait();   
                } catch (InterruptedException e) {  
                    Thread.currentThread().interrupt();  
                }  
            }  
            playTone("mi.wav");  
            System.out.println("mi.wav");
            synchronized (lock) {  
                turn = 2;  
                lock.notify();  
                try {  
                    lock.wait();  
                } catch (InterruptedException e) {  
                    Thread.currentThread().interrupt();  
                }  
            }  
            playTone("sol.wav"); 
            System.out.println("sol.wav");
            synchronized (lock) {  
                turn = 2;  
                lock.notify();  
                try {  
                    lock.wait();  
                } catch (InterruptedException e) {  
                    Thread.currentThread().interrupt();  
                }  
            }  
            playTone("si.wav"); 
            System.out.println("si.wav");
            synchronized (lock) {  
                turn = 2;  
                lock.notify();  
                try {  
                    lock.wait();  
                } catch (InterruptedException e) {  
                    Thread.currentThread().interrupt();  
                }  
            }  
            // Play do-octave together  
            playTone("do-octave.wav"); 
            //System.out.println("do-octave.wav");
            synchronized (lock) {  
                lock.notify();   
            }  
        });  

        Thread thread2 = new Thread(() -> {  
            synchronized (lock) {  
                try {  
                    lock.wait();   
                } catch (InterruptedException e) {  
                    Thread.currentThread().interrupt();  
                }  
            }  
            playTone("re.wav"); 
            System.out.println("re.wav");
            synchronized (lock) {  
                turn = 1;  
                lock.notify();  
                try {  
                    lock.wait();  
                } catch (InterruptedException e) {  
                    Thread.currentThread().interrupt();  
                }  
            }  
            playTone("fa.wav"); 
            System.out.println("fa.wav");
            synchronized (lock) {  
                turn = 1;  
                lock.notify();  
                try {  
                    lock.wait();  
                } catch (InterruptedException e) {  
                    Thread.currentThread().interrupt();  
                }  
            }  
            playTone("la.wav");
            System.out.println("la.wav");
            // Play do-octave together  
            synchronized (lock) {  
                lock.notify();   
            }  
            playTone("do-octave.wav");
            System.out.println("do-octave.wav");
        });  

        thread1.start();  
        thread2.start();  
    }  

    private static void playTone(String toneFile) {  
    String filePath = "D:\\NORTHEASTERN\\COURSES\\Application Engineering and Development_INFO 5100\\INFO5100 LAB\\Thread\\Assignment5\\Tones\\src\\tones\\" + toneFile;  

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
            Thread.sleep(1000); // Adjust as needed  
        }  

    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {  
        e.printStackTrace(); // Handle the exception (e.g., log it)  
    }  
} 
}  

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libarysystem;

/**
 *
 * @author up889519
 */
public class Books {
    private String title;
    private String author;
    private boolean currentlyLoaned;
    
    public Books(
            String title,
            String author
        )
        {
            this.title = title;
            this.author = author;
            this.currentlyLoaned = false;
        }
    
    
    
    
}

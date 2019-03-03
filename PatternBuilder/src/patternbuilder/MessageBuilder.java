/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternbuilder;

/**
 *
 * @author aricdayangutierrezsanchez
 */
public abstract class MessageBuilder {
    
    protected Message message;
    
    public Message getMessage(){
        return message;
    }
    
    public void newMessage(){
        message = new Message();
    }
    
    public abstract void setMail();
    public abstract void send();
}

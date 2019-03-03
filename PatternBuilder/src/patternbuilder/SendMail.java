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
public class SendMail {
    
    private MessageBuilder message;

    public MessageBuilder getMessage() {
        return message;
    }

    public void setMessage(MessageBuilder message) {
        this.message = message;
    }
    
    public void loadMail (){
        this.message.newMessage();
        this.message.setMail();
    }
    
}

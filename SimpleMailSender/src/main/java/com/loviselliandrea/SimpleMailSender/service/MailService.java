package com.loviselliandrea.SimpleMailSender.service;


import com.loviselliandrea.SimpleMailSender.model.MailStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String fromMail;

    /**
     * Il metodo sendMail() si occupa di inviare la mail. Recupera tramite Spring e come a lui indicato lo username dall'
     * attributo "fromMail" e l'oggetto "mailSender" (@Autowired). Destinatario e corpo della mail dai parametri.
     * Genera poi un oggetto di tipo "SimpleMailMessage" dove passare tutti i valori recuperati.
     * Tale oggetto tramite i suoi metodi implementati riceve e setta in ordine:
     * -username della mail
     * -oggetto della mail,
     * -messaggio,
     * -destinatario.
     * Infine tramite l'oggetto "mailSender" avviene l'invio del suddetto "simpleMailMessage".
     * @param mailRecipient il destinatario della mail ricevuto dal controller.
     * @param mailStructure il corpo della mail ricevuto dal controller.
     * @return String di conferma invio e procedura.
     */
    public String sendMail(String mailRecipient, MailStructure mailStructure){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(fromMail);
        simpleMailMessage.setSubject(mailStructure.getSubject());
        simpleMailMessage.setText(mailStructure.getMessage());
        simpleMailMessage.setTo(mailRecipient);

        mailSender.send(simpleMailMessage);

        return "Mail inviata correttamente";
    }
}

# # SpringBoot--MAIL_SENDER

## Descrizione
Un semplice prototipo di Back-End per l'invio di email con SpringBoot//Spring (Java Mail Sender, Spring Web, Lombok)   
  
## Framework e Librerie utilizzate
-SpringBoot / Spring    
-Maven   
-Spring Web    
-Java Mail Sender    
-Lombok    
-PostMan    
-JDK 17    
    
## Installazione, configurazione 

Il progetto è già pronto per l'utilizzo. E' configurato con la porta standard "8080"  
Tramite IDE vengono impostati automaticamente JDK e l'annotation processing di Lombok (appaiono le notifiche).  
Una volta fatto un check su ciò sopra detto si può avviare l'applicazione.  

## Utilizzo con PostMan

Ho condiviso qui la libreria dove si trova la chiamata già pronta -> [PostMan](https://progettosbloviselliandrea.postman.co/workspace/New-Team-Workspace~b2d02203-2a9a-47ed-867e-79b9a8e2c608/collection/27730869-57d370eb-d036-42b3-b280-8560680a1b23?action=share&creator=27730869)

nel BODY della chiamata è possibile sostituire i valori per modificare il corpo della mail  
nell' URL è possibile sostituire l'indirizzo mail del destinatario  

## Come fare una chiamata da zero con PostMan

TIPO CHIAMATA->POST  
  
URL-> localhost:8080/mail/send/mail_example@gmail.com  
  
BODY -> RAW -> JSON:   
  
{  
    "subject": "scrivi qui l'oggetto della mail",  
    "message": "scrivi qui il messaggio della mail"  
}  
  
HEADERS-> togliere la spunta standard a **content-type**  
  
aggiungere nuovo **content-type** (key) + **application/jason** (value)  
  
  
## Come cambiare il mailSender dall'application.properties  
  
Per questo progetto è stato creato un indirizzo gmail ad hoc: simplemailsenderapplication@gmail.com  
Se si desidera sostituirlo, è necessario un indirizzo gmail con autenticazione a due fattori.  
Una volta scelto, è necessario entrare nella sezione security->autenticazione a due fattori->  
scorrere in basso fino a password per le app->scegliere un nome e copiare la pw recuperata   
(potrebbe essere necessario rimuovere gli spazi)  
  
a quel punto entrare in application.properties e sostituire i campi mail e password.  







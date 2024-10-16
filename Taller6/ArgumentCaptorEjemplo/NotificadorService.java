package Taller6.ArgumentCaptorEjemplo;

public class NotificadorService {
    private final LoggerService loggerService;

    public NotificadorService(LoggerService loggerService) {
        this.loggerService = loggerService;
    }

    public void enviarNotificacion(String mensaje) {
        // Aquí podrías agregar la lógica para enviar la notificación
        loggerService.log("Notificación enviada: " + mensaje);
    }

    public void enviarMensajes(String[] mensajes) {
        for (String mensaje : mensajes) {
            // Aquí podrías agregar la lógica para enviar la notificación
            loggerService.log("Notificación enviada: " + mensaje);
        }
    }
}

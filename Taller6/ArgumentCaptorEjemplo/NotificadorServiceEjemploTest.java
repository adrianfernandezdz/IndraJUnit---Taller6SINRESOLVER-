package Taller6.ArgumentCaptorEjemplo;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class NotificadorServiceEjemploTest {
    private final LoggerService loggerService = mock(LoggerService.class);
    private final NotificadorService notificadorService = new NotificadorService(loggerService);

    @Test
    public void testEnviarNotificacion() {
        // Mensaje de prueba
        String mensaje = "Hola, esto es una notificación.";

        // Enviar notificación
        notificadorService.enviarNotificacion(mensaje);

        // Capturar el mensaje registrado en LoggerService
        ArgumentCaptor<String> captorLog = ArgumentCaptor.forClass(String.class);
        verify(loggerService).log(captorLog.capture());

        // Verificar el valor capturado
        assertEquals("Notificación enviada: " + mensaje, captorLog.getValue());
    }

    @Test
    public void testEnviarMensajes() {
        // Mensajes de prueba
        String[] mensajes = {"Hola, mensaje 1.", "Hola, mensaje 2.", "Hola, mensaje 3."};

        // Enviar mensajes
        notificadorService.enviarMensajes(mensajes);

        // Capturar todos los mensajes registrados en LoggerService
        ArgumentCaptor<String> captorLog = ArgumentCaptor.forClass(String.class);
        verify(loggerService, times(mensajes.length)).log(captorLog.capture());

        // Verificar el número de mensajes capturados
        assertEquals(mensajes.length, captorLog.getAllValues().size());

        // Verificar los valores capturados
        for (int i = 0; i < mensajes.length; i++) {
            assertEquals("Notificación enviada: " + mensajes[i], captorLog.getAllValues().get(i));
        }
    }
}

package ee.bitweb.springboot;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

@Component
public class Sender {
    public static void sendMessage(String input) throws IOException, TimeoutException {

        ConnectionFactory factory = new ConnectionFactory();

        try (Connection connection = factory.newConnection()) {
            Channel channel = connection.createChannel();
            channel.queueDeclare("votes", false, false, false, null);

            String message = input;
            channel.basicPublish("", "votes", false, null, message.getBytes());

            System.out.println(message + "vote has been received");
        }
    }
}
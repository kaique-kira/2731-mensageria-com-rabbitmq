package br.com.alurafood.pagamentos.amqp;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PagamatoAMQPConfiguration {

    @Bean
    public Queue criaFila(){
        return new Queue("pagamento.concluido", false);
    }

    
}


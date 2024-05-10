package br.com.dio.contabancaria.config;

import java.util.concurrent.TimeUnit;

public class TempoDoCadastro {

    public static void tempo() {

        try {

            TimeUnit.SECONDS.sleep(1 );

        }catch ( InterruptedException e ) {

            e.printStackTrace();

        }
    }
}

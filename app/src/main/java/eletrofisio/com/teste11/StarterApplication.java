package eletrofisio.com.teste11;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;


public class StarterApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Habilite armazenamento local.
        Parse.enableLocalDatastore(this);

        // Codigo de configuração do App
        Parse.initialize(new Parse.Configuration.Builder(getApplicationContext())
                .applicationId("ZWxldHJvZmlzaW9AZ21haWwuY29t")
                .clientKey(null)
                .server("http://eletrofisio.herokuapp.com/parse/")
                .build()
        );


      /*// Teste de configuração do App
      ParseObject pontuacao = new ParseObject("Pontuacao");
      pontuacao.put("pontos", 500);
      pontuacao.saveInBackground(new SaveCallback() {
          public void done(ParseException e) {
              if (e == null) {
                  Log.i("TesteExecucao", "Salvo com sucesso!!!");
              } else {
                  Log.i("TesteExecucao", "Falha ao salvar os dados!!!");
              }
          }
      });*/

        //ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();
        // Optionally enable public read access.
        defaultACL.setPublicReadAccess(true);
        //ParseACL.setDefaultACL(defaultACL, true);
    }
}

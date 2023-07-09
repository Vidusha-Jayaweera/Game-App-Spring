package com.vidusha.gameapp;

import com.vidusha.gameapp.game.GameConfiguration;
import com.vidusha.gameapp.game.GameRunner;
import com.vidusha.gameapp.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {

    public static void main(String[] args){

        var context = new AnnotationConfigApplicationContext(GameConfiguration.class);

        context.getBean(GamingConsole.class).up();

        context.getBean(GameRunner.class).run();
    }
}

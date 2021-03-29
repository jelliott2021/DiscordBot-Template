import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import java.beans.ExceptionListener;
import java.util.*;
import javax.security.auth.login.LoginException;

public class Main {

    public static void main(String[] args) {

        List<GatewayIntent> gatewayIntents = new ArrayList<>();
        gatewayIntents.add(GatewayIntent.GUILD_MEMBERS);

        //Discord Bot Token
        JDABuilder jdaBuilder = JDABuilder.createDefault("ODI1Nzg1NTQ1NzE5Njc2OTM5.YGC-uA.EHsocsUftmRq5IJywOSKtQB12ac");
        JDA jda;

        //Event Listener for Help Class
        Help help = new Help();
        jdaBuilder.addEventListeners(help);

        try {
            jda = jdaBuilder.build();
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }

}

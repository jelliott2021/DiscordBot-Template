/*
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.events.message.priv.PrivateMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.entities.Member;


public class Messages extends ListenerAdapter {

    Create Schedule Direct Messages from Server
    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
        Member member =e.getMember();
        if(e.getMessage().getContentRaw().equalsIgnoreCase("COMMAND")){
            member.getUser().openPrivateChannel().queue(channel -> {
                channel.sendMessage("RESPONSE").queue();
            });
        }

    }

    Create Schedule Direct Messages from Direct Messages
    public void onPrivateMessageReceived(PrivateMessageReceivedEvent m) {
        if (m.getMessage().getContentRaw().equalsIgnoreCase("COMMAND")) {
            m.getChannel().sendMessage("RESPONSE").queue();
        }
    }

    Display Schedule Server from Server
    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
        if (e.getMessage().getContentRaw().equalsIgnoreCase("COMMAND")) {
            e.getChannel().sendMessage("RESPONSE").queue();
        }
    }
}
 */
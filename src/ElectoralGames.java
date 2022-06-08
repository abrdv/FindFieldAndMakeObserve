import findfield.model.LDPRPoliticalParty;
import findfield.model.PartyMember;

public class ElectoralGames {
    public static void main(String[] args) {
        var ldprparty = new LDPRPoliticalParty();
        new PartyMember("Deniska", ldprparty);
        new PartyMember("Rediska", ldprparty);
        new PartyMember("Girinovski", ldprparty);

        ldprparty.publicNews("Мы меняем свои понятия на пропонятия!!!");
    }
}

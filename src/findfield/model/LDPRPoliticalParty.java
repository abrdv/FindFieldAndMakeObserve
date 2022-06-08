package findfield.model;

import java.util.ArrayList;
import java.util.List;

public class LDPRPoliticalParty implements PoliticalParty {
    private List<PartyMember> partymembers;
    private String newsParty;

    public LDPRPoliticalParty() {
        partymembers = new ArrayList<>();
    }

    public void publicNews(String newNews) {
        this.newsParty = newNews;
        notifyMember();
    }

    @Override
    public void registrationMember(PartyMember partyMember) {
        partymembers.add(partyMember);
    }

    @Override
    public void removeMember(PartyMember partyMember) {
        partymembers.remove(partyMember);
    }

    @Override
    public void notifyMember() {
        for (PartyMember partymember : partymembers)
            partymember.update(newsParty);
    }

}

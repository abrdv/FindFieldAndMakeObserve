package findfield.model;


public interface PoliticalParty {
    void registrationMember(PartyMember partyMember);
    void removeMember(PartyMember partyMember);
    void notifyMember();
}

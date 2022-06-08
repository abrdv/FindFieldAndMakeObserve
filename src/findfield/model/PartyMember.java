package findfield.model;

public class PartyMember implements NewsFromParty{
    private String fio;

    public PartyMember( String fio, PoliticalParty politicalParty){
        this.fio = fio;
        politicalParty.registrationMember(this);
    }

    @Override
    public void update(String news) {
        System.out.println(fio + " узнал новую новость, что " +news);
    }
}

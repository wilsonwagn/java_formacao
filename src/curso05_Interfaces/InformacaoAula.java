package curso05_Interfaces;

interface InformacaoAula {

    String autor();
    int aulaNum();
    default String blog(){
        return "nickiminaj.com";
    };
}

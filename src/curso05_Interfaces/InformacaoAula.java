package curso05_Interfaces;

@interface InformacaoAula {
    String autor();
    int aulaNum();
    String blog() default "nickiminaj.com";
}

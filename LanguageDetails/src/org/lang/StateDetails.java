package org.lang;

public class StateDetails {
   private LanguageInfo language = new LanguageInfo();
    private void southIndia() {
        System.out.println("-------------- South Indian --------------");
     language.tamilLanguage();
     language.englishLanguage();
        System.out.println("-------------- South Indian --------------");
    }

    private void northIndia() {
        System.out.println("-------------- North Indian --------------");
        language.hindiLanguage();
        language.englishLanguage();
        System.out.println("-------------- North Indian --------------");
    }

    public static void main(String[] args) {
        StateDetails stateDetails = new StateDetails();
        stateDetails.southIndia();
        stateDetails.northIndia();
    }
}

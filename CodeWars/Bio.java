package CodeWars;

public class Bio {
    public String dnaToRna(String dna) {
        // Do your magic!

        if (dna == null){
            return null;
        } else {
            char[] signArray = dna
                    .toUpperCase()
                    .toCharArray();

            dna = "";

            for (char c : signArray) {
                if (c == 'G' || c == 'C' || c == 'A') {
                    dna += c;
                } else if (c == 'T') {
                    dna += 'U';
                } else {
                    dna += "";
                }
            }
        }

        return dna;
    }
}

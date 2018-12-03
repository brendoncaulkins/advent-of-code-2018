import java.util.HashMap;

public class Day02 {

    public String[] testIds1 = {"abcdef", "bababc", "abbcde", "abcccd", "aabcdd", "abcdee", "ababab"};
    public String[] testIds2 = {"abdce", "fghij", "klmno", "fguij", "wvxyz"};
    public String[] ids = {"qywzphxoiseldjrbaoagvkmanu", "qywzphxeisulpjrbtfcgvkmanu", "qywzxhooiseldjrbtfcgvcmanu", "qywzphjojseldjubtfcgvkmanu", "qtwzphxoieeldjrbtfcgvrmanu", "tywzphzoiseldjritfcgvkmanu", "qyuzphxoiseldjrbtfcgykbanu", "qswzmhxoiseldjrbtfcgvkaanu", "qyczqhxoiseldjrbtfcgvkbanu", "qybzpqxooseldjrbtfcgvkmanu", "qywzpoxoxseldjrbtfcgvpmanu", "qywzphxbipeldjrbtfcgvkmaru", "qywzpmxoiseldjrutqcgvkmanu", "qywzphxoisesdjrrtfchvkmanu", "qywzphxoiseldhrbtfcgukyanu", "jywzphyoiseldjrbtfclvkmanu", "qywzvhxoiselrjrbtfcgvkmanl", "qywzplxojseldjrbtfcgvkmamu", "qywzphxoiseldjrbtacgvkmvnd", "qywpphxoiseldjrbtfcgvkvenu", "qqazphxoiselqjrbtfcgvkmanu", "qyozvhxoiseldjrbtfcgvkmadu", "xywzphxliseldjhbtfcgvkmanu", "qdwzphioiseldqrbtfcgvkmanu", "qswyphxoiseldjrbtfcgvkmanx", "qowzshxoiseldjrbtfigvkmanu", "qywzphxoiseldjjbtfcgvkmawq", "qyhzphxoiseldjrbtfvgvkmynu", "qxwzphxoiselmjrbtfcgvqmanu", "qywzphxoiceldjrbtfcgikmgnu", "qywephxoiseldjrbthcgvkmane", "yywzphxoisejdjrotfcgvkmanu", "qywzxhxoisyldyrbtfcgvkmanu", "qywzpjxoiseqdjrbtfcgvwmanu", "qywzphxoqweldprbtfcgvkmanu", "qywzphnoiseldjrbtfcamkmanu", "qylgphxoiseldjrbtfcgvkmauu", "qysdphxomseldjrbtfcgvkmanu", "lywzpoxoikeldjrbtfcgvkmanu", "qywzphxgiseldjrbtfeqvkmanu", "qywzdhxozseldjcbtfcgvkmanu", "qywzphxeiskedjrbtfcgvkmanu", "qmwzphxoispldjrbtfcgvkmany", "qywzphxoiselzcrbtfcgvkmanz", "qywzphxoisxodjrbtscgvkmanu", "qywzphxoiseldjrrtfcgmkmaeu", "aywzphxoiseldjrbtfmjvkmanu", "qywzthxoiiewdjrbtfcgvkmanu", "qywzpsxoisrzdjrbtfcgvkmanu", "qywzphxoiseldjkbtqcgvkmank", "tywzphxoisewdjkbtfcgvkmanu", "qywkchxoiseldjrbtfcghkmanu", "qywzphxoiseldjoftfrgvkmanu", "qywzpixoisehdjrbtfcgvkmacu", "qywzchooiseldarbtfcgvkmanu", "qywyphtoaseldjrbtfcgvkmanu", "qywyphxotsbldjrbtfcgvkmanu", "qywzphxoiseldjrbhsggvkmanu", "dywzphxoiseldjrktfegvkmanu", "qywzphxoiseldjrmtfcgvkcenu", "qywcphxjiseldjybtfcgvkmanu", "qywzphxoiseldhrbsfogvkmanu", "qmwzpheoiseldjrrtfcgvkmanu", "qywzrhxoiselpjrbtfcgvemanu", "qyezphpoiseldjrbtfcgvdmanu", "qywzphxvisewdjrbtfcgvkmdnu", "qywzphkoiseldjrbtfcgvkmdnh", "qywzehxoiseldfrbtpcgvkmanu", "qywzphxoiseldjrrtfcgvrdanu", "qpwzphxoizeldjqbtfcgvkmanu", "qywzphxojseldjrbtmcgvkmvnu", "vywzphxoiseldjrbtfcgvkmaop", "sywzphxoiselbjrttfcgvkmanu", "qywwphkoiseldjrbtfcivkmanu", "qlwkpcxoiseldjrbtfcgvkmanu", "qywzphxoiyesdjrbtfcgvkmvnu", "qywzphxoiseldjrbofcgrkmrnu", "qywzphxyiseldjrstfcgvkmjnu", "qywzphaoiseldtrbnfcgvkmanu", "qywzphxhisuldurbtfcgvkmanu", "qywzphxdiseldjrbtvugvkmanu", "qywzpzxbiseldjrbtfcgukmanu", "qyrzphxoixeldjrbtfcgvumanu", "qywzphxoiberdjrptfcgvkmanu", "qywzphxfiskldjrbtfcgvkmdnu", "qyxzphxoiseldjrdhfcgvkmanu", "qywzphrqiseldjrbtfcgvbmanu", "qyezphxviseldjrbtfcgvkmani", "qywgphxoiseldgkbtfcgvkmanu", "qywzphxoileldjrbtgcgvkdanu", "qywzphxoiseldnrbtfcwvkmpnu", "qywzphxoiseidjrbmfcqvkmanu", "qywzpkxoiselijrbtfcgvlmanu", "mywzphxoiveldjrbtfcgvkmunu", "qywzphxooseddjrbtfcgpkmanu", "qywzphxokseldjritfcyvkmanu", "qywzxhxoiseldjrbtfqgvcmanu", "qywzphxoisfldjrbpfcgvkmaju", "qywuphxgiseldjrbffcgvkmanu", "qywzphociseldjrbtfcgvkuanu", "qywzphxoiseldvrbtftgckmanu", "qywzpbxoisrldjrbtfngvkmanu", "qywzphxoiseldjrntfygvdmanu", "qywzphxviseldkrbtfcgvkianu", "qywpphxgiseldjrbtfctvkmanu", "qywzphxoicewdjrbtfcgvsmanu", "qywzpcxoiseldjmbtfcgvcmanu", "qrwzphxoiseldjrbtfcgjumanu", "qywzphxoiselojrbtfcgxkmaau", "qywzphxojsbldjrbtfcgykmanu", "oywzphxoiseldjrbtfqgvkmvnu", "qywfphxpiseldjrbtfckvkmanu", "qyyzwhxwiseldjrbtfcgvkmanu", "qywzphxgiseldjrbtfchvkmabu", "qywzphxfiseldjrbtfcgukoanu", "qywzpdxoisyldjrbtfcgvkxanu", "dyuzphxoiseldjrbtfcgvkmamu", "qywzphxoiseldjrbifcgvkmnnp", "qywzpyxoiseldjrbtfcgvklano", "dywzphxoiieldjrbtfcgvwmanu", "qywzphxoihemdjrbtfcgvdmanu", "gywzphxoxseldvrbtfcgvkmanu", "qywzqhxoissldjwbtfcgvkmanu", "eywzphxoiieldjrbtfcgekmanu", "qyizprxciseldjrbtfcgvkmanu", "qywjphxoiseldjrbtfcgckmano", "qywznhxoiseldjrbrfcgvkmagu", "qywzphxoisrldjdbvfcgvkmanu", "qyyxphxoiseldjrbtwcgvkmanu", "qywzphxoiseldjdbtfcpvkmjnu", "qywzvhxqiseldjrbofcgvkmanu", "vywzphxoiseldjrbtfcgckwanu", "qywzphgbiseldjrbtfcgvkmazu", "qcwzphxoiseldjrbqfcgvkmdnu", "qywzphxoismldjrbtfcgkkmznu", "qywhphxoiseldjrbtccgvkmane", "qywzphzoiseldjrbtfcgvqmauu", "hywzphxoiseldjrbtfcuvkmanc", "qywzphxozsejdgrbtfcgvkmanu", "qyszphxoiseldjrntfygvdmanu", "qywzphxoisgldjrbtfcgvklaru", "qywzhhxoiseldjrbtscgvkmqnu", "qywjphxpiqeldjrbtfcgvkmanu", "qywzphxoiseldxrptfclvkmanu", "qywlphxoisehdjrbtfcgvkmanc", "qydzpfxoiseldjrwtfcgvkmanu", "qywzphxoiseldjrbtxcgqkfanu", "qywophxoiselfjrbtfcgvkmani", "qywzyhxoiszldtrbtfcgvkmanu", "qywzphxoxseldfrntfcgvkmanu", "qywzphloiseldjqbtfcgvkmtnu", "qywzpuxoiseldorbtfcgvkeanu", "qywzphxoiueldjrwdfcgvkmanu", "qgwzphxoiseldjmbtncgvkmanu", "qywzphtggseldjrbtfcgvkmanu", "qywzphxoisrldjrbtfmgvhmanu", "qfszphxoiseldjqbtfcgvkmanu", "qywzphxpisjldjrbxfcgvkmanu", "qywznhxoisepdjrbtfqgvkmanu", "qywzphioiseldjabtfcgxkmanu", "qyizphxaiseldjrbtfcgvkmaxu", "xywzphxoiqelvjrbtfcgvkmanu", "quwzphxoiseldjretfcgvkmaau", "bywzphxoiseldjrbtucgckmanu", "jywzphxoiseldjrbofcgvkmani", "qywzphxoiseltjkbtfcgvkmabu", "eywzphxoiselgjrbtfkgvkmanu", "qywzphxoisengjrttfcgvkmanu", "qywzphzoiseldjrbtfcgvkmknk", "quwdphxoiseldjrbtfcxvkmanu", "qcwzzhxoiseldjrgtfcgvkmanu", "qywgphxdiseldjrbtfcgjkmanu", "qywzpdxoivefdjrbtfcgvkmanu", "qywzphxoiseldjrbtfdgvjmpnu", "qfwzphxoiseydkrbtfcgvkmanu", "qywzphxdiqelqjrbtfcgvkmanu", "qywzvhxoiseldjrbtfognkmanu", "qywzphgoiseldjrbcfcgvtmanu", "qywophxoiseldjrbtpcgvkmank", "qywzphxoiszldjretfcgvkmabu", "qywzphxoiseldjhbtfcgvxmawu", "qcgzphxoiselejrbtfcgvkmanu", "qywzphxoisepdjrbtfcfvkcanu", "qivzphxniseldjrbtfcgvkmanu", "qywzhhxoiseldjrftxcgvkmanu", "qyazphxciseldjrbtfcgskmanu", "qywzphxoisoldgrbtfczvkmanu", "qywzmhxoiseldurbwfcgvkmanu", "qywzphxoistldjrbwfcgvkranu", "qywzphxoistedjrbtfcgokmanu", "qywzqhxodsecdjrbtfcgvkmanu", "qywzphxtisxldjrbtfcgvkhanu", "qywzphxoeseldjrtrfcgvkmanu", "qdwzphxoioeldjrbtfigvkmanu", "qjwzphxoisbldjrbtfcgvkmanz", "qywzphxoiseldbrbtfdgvlmanu", "qywzphxoiselddrbhvcgvkmanu", "zywzppxoiseldjrdtfcgvkmanu", "qywzppxqiselkjrbtfcgvkmanu", "qywzphxoihelbjrbtfcgvkmabu", "qywzphxoiseldjreyfcgvknanu", "qywzphxxrseldjrbtfcgvkmagu", "qywhpfxoiseldjrbtfdgvkmanu", "qywzphxoisxldjrdtfagvkmanu", "oywzphxxiseldjrbtfcgvkmaeu", "qywzphxoiselqirbtfvgvkmanu", "qywzphxoqseldhrbtfcgvkhanu", "qywzphxokseldjrbtfxgvkmaju", "qywzphtoiseldurbtfcfvkmanu", "qywzphxoiheudjrrtfcgvkmanu", "qrwzphxzigeldjrbtfcgvkmanu", "qywzphxoiseldorbtfcgvxmvnu", "qywzphxoisaldjpbqfcgvkmanu", "qywuphxoiselljrbtfchvkmanu", "qywzphxoisaldjrbefcgvkmsnu", "qywzphxoiteldjrbnfcgvkmanp", "qywhphxoiselqjrbtfcgvkmagu", "qywzjhxoisejdjrbtfcgvkmanr", "qywephaoiseldjrbtfcavkmanu", "qywcphxoireldjqbtfcgvkmanu", "qywzphxoiseldirbuicgvkmanu", "qywzphxoisecvnrbtfcgvkmanu", "qcwzphxoiseldjrbtfcgvrmaiu", "qywnphxoiseldjrntftgvkmanu", "qywzphxhisyldjrbtfcgvkmafu", "qyhzphxoiseldjrytfcgvkmanq", "vjwzbhxoiseldjrbtfcgvkmanu", "qyvzpsxoisuldjrbtfcgvkmanu", "qywzphxaiseldcrbefcgvkmanu", "qywzphxoiseldjgbtfsgvkfanu", "oiwzphxoiseldjrbtfcgvkmcnu", "qyezphxoiseldjrbtfcqvkmjnu", "tywzphxriseldzrbtfcgvkmanu", "yywzphxoiseldjbbtfugvkmanu", "qywzpfxviseldjrbttcgvkmanu", "qywzphxoiceldcrbtfugvkmanu", "qymzphxoiseldjratfcsvkmanu", "qywzphxoiselxjrbdfcgvkpanu", "qywzphxoiselujrbtfkgvimanu", "qywzshyoiseldjrbtfcgpkmanu", "qywzphxoiselfjrbtfsgvkmant", "qywpphxoiseldjxbtfcyvkmanu", "qywzfhxoiselqjrptfcgvkmanu", "qewzphxoiseldprbtfcgvkmand", "qywfphxoiseldlrbtfcgvkmgnu", "qywzphxoiseldjhbtqcovkmanu", "fywzphxoiseldlrbtfcgvkjanu", "sywzphxoiseldjrbhfccvkmanu", "qywzphxoiseldjfbtfcrvkmpnu", "sywzphxoisrldjrbtfczvkmanu"};

    private HashMap<Character, Integer> charCount(String str){
        HashMap<Character, Integer> count = new HashMap<>();

        for (Character c : str.toCharArray()) {
            if (!count.containsKey(c)) {
                count.put(c, 1);
            } else {
                count.put(c, count.get(c) + 1);
            }
        }

        return count;
    }

    public boolean hasDoubles(HashMap<Character, Integer> counts) {
        return counts.containsValue(2);
    }

    public boolean hasTriples(HashMap<Character, Integer> counts) {
        return counts.containsValue(3);
    }

    public boolean areNearMatch(String s1, String s2) {
        if (s1.length() != s2.length()) { return false; }

        int misses = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                misses++;
            }
        }
        return misses <= 1;
    }

    public String reduceToCommonLetters(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.substring(0, i) + s1.substring(i + 1);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Day02 exercise = new Day02();
        String[] ids = exercise.ids;

        // Exercise 1
        int doubles = 0, triples = 0;
        for (String id : ids) {
            HashMap<Character, Integer> analysis = exercise.charCount(id);
            if (exercise.hasDoubles(analysis)) {
                doubles++;
            }
            if (exercise.hasTriples(analysis)) {
                triples++;
            }

            System.out.println(String.format("%s: doubles=%s, triples=%s",
                    id,
                    exercise.hasDoubles(analysis) ? "YES" : "NO",
                    exercise.hasTriples(analysis) ? "YES" : "NO"
            ));

        }
        System.out.println("checksum: " + (doubles * triples));

        // Exercise 2
        for (int i = 0; i < ids.length; i++) {
            for (int k = i + 1; k < ids.length; k ++) {
                if (exercise.areNearMatch(ids[i], ids[k])) {
                    String result = exercise.reduceToCommonLetters(ids[i], ids[k]);
                    System.out.println(String.format("%s & %s => %s", ids[i], ids[k], result));
                }
            }
        }
    }

}

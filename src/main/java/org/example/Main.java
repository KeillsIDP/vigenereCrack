package org.example;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Main {

    public static List<Character> real = List.of('О','Е','А','И','Н','Т','С','Р','В','Л','К','М','Д','П','У','Я','Ы','Ь','Г','З','Б','Ч','Й','Х','Ж','Ш','Ю','Ц','Щ','Э','Ф','Ъ');

    public static void main(String[] args){
        String text = "ГАИФФЫХПМЬЬЯЯЙХЙМЭФГЭФХПАЦЭДЯЭЙИВРФЖУЛЭХЙТЬЛФЫЖЪНЦЙНФЪЖЛЙГЬМФОРЖМБЕЛЪУЫФВБУИЯЫЕБАМЫВККЦКЙЯЬЧИЧШДЖЭФГМХЫЗГЭЪОЫФЖЦРСИУШЩЗОЙВЭЦЙЪЭИЩЫАЛТУЫИДШСЙКСЪБЬЦЦЦЪЫРУЙГЬБКЬЯЧЮУУНТСШДЫЦТОЧЧШДВЮЩВЯЖЮХУДЛИЗЛЫНБЭОЪДМЫГУЫФЛЯЫРФБЦЛЧЕСЕБФЫТБЪФКЦРТЬЦСЧЦЧГЭУЖЮТЭПЭМЧЧЦЧЗФГЦАГКВЖЖВЧЧЙФЖЪКИЮЖНЛЖДЦЬУБЛБРНЧАБЧЙКСНПДФКЗКВЭСАЭЪХНСЬФЙСШХЮСЮГОЭФМФЬИСВЫЙЖЭФЫХДШИЩХЧЧХЙЯКИЭЬЕЧБУЧЛЯХЫЗЯЧЬЦЬЩЗШИГЧАТЦЕМЭШКЮТЫХЫЭПУЦЯЫЖГЯТЙИШОРПВСЬМКЬСОВЭЛДЪЯЭЖМШИЩФМЫЦДБЕЧЕФХЩЮЫМДЯТЭОМЮЧДЭКФФЧВЧБЧЩЧДЗЫИДФЗДМЗАСЛЯШЫЫЗЫИЪЮЩУБЭУХЭПУЕЧГЮВУПСМЙДЩЧДРЧЗКЬИЬИЛХРПДСЩНТИЙЙМЬЩВЪЛЙЦВШЕМФФХКЭШЩЗЯЫНМЩЫТОФЛФМОЛСУЛЖЫЦЭБЩВЪЯЭЖВБФЭПЫИЦВСЙГЦЖШКОУЖДФТШДЛСКМФЫЧКЬСЩНЪИЙЖФАХЙФЭШЫЮИРБЙШЕДАЫДФФЛЯФДЩШЭСИЮДНЦЬЦЯЫХГЯТЙИШСЗБАЮЬКЯФРБВЮЫИЭЫРЭМШЦЦТШЮМКЦФОЯИХИЧЖИОСЕШЯЩЫЮЧЙАРХЮСЯОШКММЩЮЩБЯХЮБОБЧДКЬЩЫАУХИЧЛФЯЗЮЬЙФШРАДЯВКТЦЫПБЭЫНЪИЗЙЧЯМИЭЖЭЙВЯИХВСЫЙЛУИФЪЫЮЫЗЧЬЦЬЩЗШЭМЫЙФОЗМЮЦТЪЧЧЩКЮЧЩНЯФЭМЮЫЪЦФЫЭПРСЧДФФЧЙЯЛЩНЛЛЕДЩВЬЦБХЩБИСЬВЕХРЭЙЯФИЩЧЗЯЭМОГСЬЗМЕЧЧНЬФЫЕЧШЧЙКЧЬЦДЬЙГЬЭРУЙЯОГСЧЧБЖЭИКЯТЭПЭМЦИЦЬЕЫЮПИЩЛФЭИЭЫТЖЦСЫАДЮТОВЕШКЭЭЙИЩИЮБГЭРОЩТЖСВЪЫЧШЧРНУГЧЧИСШБНЭЖНЛЖШДГУЭЖИЕШДБЦЪИЦЩЩКББВЗБТЭЛВЧЫОЬФОИДРСЗРСЩМБЦКФФХЭИЧЯСЧФЧФФМФСФЯТЙЙЧЯСОХЩЩЫЮШСДБХЭСВТЧФЛТЖВДШСКРЩЯУЙШЧДЯУЖФЯЩСЧИЙХЬБИЬЗТЫШМНИТОЛСЮШБЦРЮТХЫФЯХСГЦФХГЙЯТГЛТЖУДШЧЧЖЛХОЫБЧДФЯХОДЯЩКФФЗКОЫЮХЫЙЫЖВЧФИШЙРИЙЮФИХЧСКФШСМШЧСКГЭЗКЪХЫЙЮИЦЦТЫООФЫЬМИЧЩЧЫБЧОЦЫРГИЦКЧИКЪДТБЭИКЧЦЧГЭЯГСЩЮМГГЧПИСЪБЬСВКТЧФЯЫЮЧДИЩЯМЩВТХНЩКСЛАШЦБЧЗХЮАЦЖССШКДЮЧЕЮЩЭГНУТИШЩШЙЧЦЦИРЧЕЙВВЛЪДЫДБЩЬЙИНСАЦЬУЫИЕЭШЯЩФКЗКВЪЯЮУТОЛЕЫХГУЙОШЩЗШГЦЙДЯФДЦОЭОЖГЬЧХЙРЧЫИЧДПЯДЩНФИЙОВРЭЖТМЧККУУОХТЫСВФФЖССЩДАЭФФФЫЧКЭЦХЪХЬЕБИЭЫЭПЮЖЕЬЭЫЗБТЭКПГЧКЧВЩМЭУХРЪХЭХМЯВПРЙЖЛБИРЗБТЕКЭБЧКЛФЫХВГЧЕЪЛЫИДЯВГЛСЮШБЭРАЪЯСКЕЭФОЧЬФЯЗЫИМСЧШЙЧЬЙИЕЫЮЫЮПКЧИКЪУДСЧЧИЕЖЖДЧЬДНЛЫИМЯЧЛИВДКНЫЙЖДЛДЫГЦЙДБХЭЛЬЭРФТУЧКИЭЦИДЧШМЯРЙИЬЩЛЭЙЬЧВЧЖЮМПЭТИШВЭМЛЧЩНТЦЕКЮМЯЛБРФКЙСЧПРТЭУЛУЫИЬЩЯДАЫХЖЦЧШЦВСЭНТФШКЕШЬЛИЧЬЖЧБЖЛЙТЫХРЯФИЩЧЦКЗЭЫИЯИЗДИЭЛЦФЬЖПМЯЙИШЫОЬЗЫСБХЬМБЬИИИЭФХЙДЦЦГКЫЫЕЧБФИЩЧВБЗЭЫГРЩРЭЙТВНФЛРИБИХКБИЮМЭЯКФЧВЩМЛУЦЖЛИЮКОЮССИЧУЙЧЯФИШЬЮМЫЦИФШЬШЙВЦСВТУЫБЛГЬНТАРЛЬЦЭЧИЩЧЬЙЦЦГКЬСЗЗУЮЖЦСЖПМЯЙИШФХЛВШФОСЧЭСНШЩЕФЪЫЖЙЪФЭЦЛЕБГЦЛИЦИЪКЖЭРЛБЬЭЙЙСЧБЦКЗМАИЬКЪХЫЙЮИЦЦЯЪЕДКЧЩНТЦЖЦРЩЫИЮЧЪКТСЧЧЯХЙЗВГШЖИВАГЯТЙИШИШДЗЫЛЭЦСЯФВСЕШЩТХГМЯСЩКЧДЦБЭЦИИЙКСДСЩНТЯЭФБЭРФЕЯРПВЪЪЦТЫЫНДЮЩМСЧШЫЗЫУБЯХЮБВВЛЦБЬЕДЭЖЧВЕАЭБЭМЫЧИЧЕКБИЙИЩЩЭЙЭБСЛРЛЭЖБЭЧЛТИЫГБУЫЖССЦФВФФХДИЭПЯСЙЖЩЩШКБЦЛГКЦРПДСВПКЬЧХПГКВТЫНБПЭИЩЭЩЭСЭЬСЛЪХЭХЮУЭЖЭЩУМПУТДЧСАЖВЫФЧИЫРЙБИРБЪЭЫФОЮЬБЪЦШКЭУХЭУЙЫХЗИРБЙШЕЖВХЩМШИРЗВВЛЖЮЩРЭЙЮСАЯЦЕМПЮКДРЮРИЗЦЪИСЧЧЧНГЧЧТТДЫБУШНТЯХНФЦЪИЦЩЩКББЩЧТТХМОЮЬБЪЦШКЭБЕЛЪЦХАЙЮСЩЫВЮМЮУУИШВВЦВЭЪЦФХШЯЕФЫГКЕТДФУЛЖСИКМЯЬЩНЧЩЯКЗЦФОФИЗФЧЦЙИЩЩТЧНГЩЛЪФЫХДШСКЪХЫЙЮАКВЪЙТДЯЧЩЦФХЫЙЭЬЬЮТТЭХГЭТЪЭЧЧДЮПИДФЬЪФЙЫХХГЬДЦОЭЦИШЬЕВЙЮФЭУФХОВШЬЛТЦЕКЮЫЫЛТУЩКПЭЛЗТЫХЦРВЖФФТЙОВЖЧЗФЛЫИООЛИУИЗФМЛФИУИАЖМБУГШЬЮМЖУФИШЮЖЕЬТВНШЧЪПВКЬЛТЬЩХЗЦЦИЩЧФБФЦФЧИЫХЛЙЮЩДБИЗЧГЫТЖЧЩРЗВРКЗЪМШДЗЫЛЭЯУЕКОПЗЕСЩТДЭСЬЦРЩЮМЖУУХЩТЭКБСЬЧЖЭЕККУТИИОЖАВССЯЧЧЦКБУЦЦЕЯРЙДМКЙФЙШКДЮЬЙКЬЕЯОЮЧБЙШЕЕДШЦЦФЛЭЖБЫУЖКЧЦДАЫИФКЬЩЫЭПЧЙКЧЯМБАЛЪЯЪЫЙМТЧМНЛЫЕЧЧЧЗКЩЗШЭМЭИЫЙЛСМРЭГРЧУДБЦШЭСЩЗДЖЭРФФТДЦВЪЛИЩЭХКБСВЮЯТФЯГЭШГЮСЗБЗЦХОЭИАЖМБУОЦЩЩКББЦИЧСЩДЗОЛИЧЩЪФУРЩЩШИРХДШВИЧИЗДЬУТЧЕФРАМБЕЙФЫХПДБЕЧЯШКЙМТЧМФЭШМАГВДРЧЩКБЯЧЕЛФЫЖМВЛЖИЕШДБЭЪОЧЧСПУОЛИЩЧШЧКЮЧЗБТЫУЮЭШЭЭКФФЩЭЛЪЧЩЩЗБЭЫГЧСРЛЙГЬЧИЩЮЙМВУЖРСЧДЮПФЖЧЬЦКБЦЧАТЭХЙБЭЬЛЪЦХАЙЮСГЛФХУМШЩИЭЩСДЫЫТИФИЗДЗПФЭПЫЫВМЩЧДНЬЗЯЬЦХЖЦЧШЦМЫИГЦЕТЧНГЧДЛЛЫЫЗЫЭЦЙЪЪФВБСДЮЙЖЗМСЪЦФЮШКЕЮЬЙФЭЧМКЮЧЧИСШМВЧСЛЧЬЪЯЮУТЧЕЫЩБФУЛЪЛЖЧХЩСЩФРКЪКЮЭХКЪХЫЙЮИИФЪТЭЛЬЭЖДСЖЗШГГСБЧЩЯМБЦЛГКЦРЙДМИЖЦВЬЖЧВЧМТРДЗЬЭХМТХДКГЦФОЯХНБОЦТЪЧКЮЛЙГЬЙФФВДЮИХОЙБХИДЬЧУФЯЭИДЮЩЕТЪХЙЮВУОПТРЦЯДСУЦВНБЕЫИВЯТХПФУЪДХЬЕБИСДФФХЦЙВСЬЛТЬЩДАЭФФЧЩЯКЮЭЙИЩЧШДГУЭЖСЮЖЕЬВЧЧИЙХЬБЭРЧТТЫНЯЧЩЦТТАКНЭЛИЦЦЫЙВРЩКЛЫЫБПЭЦЦФЛЭЖБЫУЖИЧЗЖЭСЧШФОРФЙЧЕБЪБХЦМШИЩЦЩЩКББЫИЛЦЫПРФЧДЪТДЫГЦЙГЮВНОВЪОФФШОЛВЧФЩИЕДЫБУФИЩССЖМЭЪЦФХШЯЩФЫГКЖДЙВСЩЧИЧКПДЧЙХЩЦЕКЮЫЫВККЦДНЦБГЧИЗЖВТЬБКЩТАЙШЕЛФЧЧПМЧЬНФХХИВЮЛИЦЦЫАБМЫМШЬЕСЯЖЧЗФЛЫЙДФЭЖСЛЕЧНЮВПЭЫЖОДЩСЛЙТДЫБУИДФЬЦКГГЧФТЫШМЖУСБФЪШЧЮИЬЗТЫШМЙРЧЙФЭФФВВСНТЮЖЕЬУЫДФЮСЧЩУЮЖИЬЩЬОИЙЛЙТЭЙМФЬКСЗДЦМЩЧПЛСЮКЕДЛИЙЛЫЗВФЩФКЬМДЗЫУИЛЛЭЙЙЧЩДЭКФФЯЬЙОИЛЭЖЭЦШЩЦЩЩКББЫИЧЮЭПЙЯКЗТЫШМОТЙШПЧЭГМБЧЙИЩЮБПЭОХЮЧЧМХЮВКТФЫВДКЩКТУЕКОПНИЧЛХЙВСМНБФЖПМЫЮЦЪЮСДОШЬЛЧВАЖБАЛЦЯФШКЭБЬПЭКФФМГЬДХЧФБКЧЬЛЧЧЦКБЦШЭСИЮЯФЦФДХЧСЙУСБГЦИКЬЯЯЬЧЯХЙГЯТЙИШСЪЫЮПХЖЦЧШЦВСЙОЧКЮМЭПЭЦЙЪШДИГКЕЪЫЫПБЦФОЯЧЧПМЧЬНФСДЦМЧЩКТЪЮЧЩЭРЦЯЫТЧНГЧДЧЬЩКПФЩЕСКНМЮПЦЦФФТМЮЦТЪЧВРОЬЫУОЦЩЩКББЧДЕЙЫХЮПЦЦТЫРПМСЭДТЯРЙДЦХИЩКВМЙБКНФЫЭЭМВЛЦЪБШЯЙТСДЧСЦФВФФЭЯЙЫЗМЫЪОЫУЭБЩЭШИИВЧККУУОЫВЮМГЭЪНФАРЙЧВЙЖЬЬШМЙЯЧЛТИФМЗЫИЪШЛРХБАЗМЙОЖКЮЩКВЪЭЫЙВВСНТИЙФЙСШГВЬШХЮСЩОЫЧЮМЩГКЧИЙХГИЫЙЖЯХОСЮЩЩЛЯРЭЦЬЦИМСЧЩДТКСУЛЖЯКЭБЬПШЦРФОЭХЧИЧЮОБЭЫГЧСЭУДВТГЧФЫБГГЬДФИАКИВЛДФЭХПВЬЙГТХЖЭЙВЛДФЮЖЕЬУХФКСТЧНГЩЧФЬСМБЦФЛБХЭХДШЩКТФХЛМШСЛЪЧСЙВРЧКЪХЫЙЮУСЙФЫХПДШСГЩЧШДЛЦХНДФЫКЭБЩНЖФОБАУХИЧЛОЖАЦИФЯФХЕЬЭИОССДШБУЦЦФЛЭЖБЫУИШСЪФВВЛИКЩТАМССНТСАХОЭЬПФЪЕКАЮЧПИЖУБЭБЕШИЧЮШЖЭКДТЭРЖВЬЩЧЧЧДЦРРЙИЭЖМЧТЬЧДЪТРЙБЭХХЦЩЩКББКИЧСЫХЮУЫОССДЖВЫЯГКЛЧЯДВФИШЩФФВВСНТИЙЖНЭРФКСТЧНГЩВФШЭЖМСБОЯТРВМКЬЕФФХЕВЩКДЯТЭОМЮЩЗБТЭГМВЛОЩФЖЦЧСЙЖЛЦЮКЩЮЩНЯЛРЖФЫРХКЩЦДБЯЪЛФЫРЙБЭИКЕТЭФМВЛИХЛХПИСКУТЮШМЩБЙГИСЬХГУИЧЕШРЗЭБЫИЦЮХЙДЯЦИЫЬУДЗЫСИЛЛХПРЮВГЛЙХВМСБОЯИКГЯТЙЭХЩШМЫЦИМТРДЦЬУМЙЯЙРАМШИЩШИРИЯВЛЖЮКТЧНГЧДЛФХУМШЩЫИЧФЯЗУУЖРЩКЦВВХХИФХЫЮГЬДФЪХИПЮЧДЯФШКЙЭПГХЬШББЫЬЧСЧЧЙВФЩФТБЙБГЦЙГЮЪЕКЛЭРБЪЛРИЭБЩВФЭЕКПЮКНФЦЫЖЙГФХСЧЧХГМЛЪТЫДПЙЬЧКЛЛЕДЩЦЦИЫЬУДЗЭЫВТУЫНЭАЛИСЧЯБНЭТГЯШОХЮГВГИЧЪЦМШСИИИЗДТКСУВЩЦДЗЫЦИТМДЛДЮЩКИЙРХЖЩЧЧИЬЬЛВЖЧВТТШДФАХЙЪЭХЪХЫМВЯЙРЖРЦЫКЪХЫЙЮИФГЛЛХПДЬЙГЛТРАВСЩФЖКФБПУЗЯЯЪЫЛЬЭЛОШФЭОМШСЮЧСЬФМФЧЛТЦЫОМФЩНТХРФЯВЫИЯРДМЗИТОВФЭНЬУЮИЧССКЖУЮЖССДЖВЦЦЦЯЫЫХЩЭЭЧИЫЫЙМЧЫЧЯХЭВДСВКТИЖЭЙВЛДЪХЭЙМВЬНЕЗММАЫЮГЦТЛОВШЧЛЧЩЕЯКЦЫЖИЧФЧЬИМЕТЪХЙЮЭЫЧЮТЭЙБИХОЩЙЭЖМЯСОВЬЕХЮПЗДБИЗФВЫТЖЛЕЧАВШЕЗЯЙРЗМЭЮГКЩЭЙЙВЦГВЩДЦМШЩХИЧЮЫЮПЯЖЬЭЖЙМВУНФФХСЩЭТКЪИЦФЯЧСНТИЙКНЫЛЖИЬЮМЗЦИЖФФЭЛВДЛОИЬЮШБЭЫБТЙХПДЮЩЙЖЗММЩРСЕЪФЗКОАТЖЦЙОЦМЩЯГЧЬЫЦЬИЫЖЕЪЮДЛВХИИЙРПДЮЩДСЩДЦДБЬНЯРТБАШСЛЪЧДФМСФОШЩЮСЯЧВГККЯМЮЭФМТЬШКПЫСУККЪОДЪЛИКИЦДО";
        List<Integer> distances = getDistances(getGramms(6,text));
        System.out.println(distances);
        int keyLength = findGCD(distances.stream().collect(Collectors.toSet()), distances.get(0));
        System.out.println(keyLength);

        List<List<Character>> frequencies = getFrequency(getSubTexts(keyLength,text));
        System.out.println(real);
        for (List<Character> frequency: frequencies)
            System.out.println(frequency);
        //encodeToDecodeSwap(text,frequencies);

        String key = getKey(frequencies);
        System.out.println(key);
        encodeToDecodeKey(text,key);
    }
    public static void encodeToDecodeKey(String text,String key){
        StringBuilder result = new StringBuilder();
        for(int i = 0;i<text.length();i++){
            char current = text.charAt(i);
            char keyChar = key.charAt(i%key.length());

            result.append((char)((current^keyChar)%32+'А'));

            if(i!=0 && i%100==0)
                result.append("\n");
        }
        System.out.println(result);
    }
    public static String getKey(List<List<Character>> frequencies){
        StringBuilder result = new StringBuilder();
        List<Character> mostFrequentLetters = frequencies.stream().map(list->list.get(0)).toList();
        System.out.println(mostFrequentLetters);
        // decode with O
//        for (Character letter: mostFrequentLetters) {
//            result.append((char)((letter^'О')%32 + 'А'));
//        }
        // find symbol that decodes to О
        for (Character letter: mostFrequentLetters) {
           for(int i = 0 ; i<32;i++)
               if(((letter^('А'+i))%32+'А')=='О'){
                   result.append((char)('А'+i));
                   break;
               }
        }
        return result.toString();
    }
    public static List<List<Character>> getFrequency(List<String> subs){
        List<Map<Character,Integer>> listOfMaps = new ArrayList<>();
        for (String str:subs) {
            Map<Character,Integer> map = new HashMap<>();
            for(int i = 0;i<str.length();i++){
                if(map.containsKey(str.charAt(i)))
                    map.put(str.charAt(i),map.get(str.charAt(i))+1);
                else
                    map.put(str.charAt(i),1);
            }
            listOfMaps.add(map);
        }

        List<List<Character>> result = new ArrayList<>();
        listOfMaps.stream().forEach(map -> result.add(map.entrySet().stream()
                .sorted((entry1, entry2) -> Integer.compare(entry2.getValue(), entry1.getValue()))
                .collect(Collectors.toMap(entry -> entry.getKey(),
                        entry -> entry.getValue(),
                        (Integer x,Integer y) -> y,
                        LinkedHashMap::new)).keySet().stream().toList()));
        return result;
    }
    public static List<String> getSubTexts(int keyLength,String text){
        String[] array = new String[keyLength];
        char[] textChars = text.toCharArray();
        for(int i = 0;i<text.length();i++){
            if(array[i%keyLength]==null)
                array[i%keyLength] = "";
            array[i%keyLength] = array[i%keyLength] + textChars[i];
        }

        return Arrays.asList(array);
    }
    public static int findGCD(Set<Integer> distances,int start) {
        int result = start;
        for (Integer element: distances){
            result = gcd(result, element);
            if(result == 1) {
                return 1;
            }
        }
        return result;
    }
    public static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    public static List<Integer> getDistances(Map<String,List<Integer>> occurances){
        List<Integer> distances = new ArrayList<>();

        for (Entry<String,List<Integer>> entry: occurances.entrySet()) {
            int prev = -1;
            List<Integer> positions = entry.getValue();
            for(Integer position:positions){
                if(prev!=-1) {
                    distances.add(position-prev);
                }
                prev = position;
            }
        }

        return distances.stream().sorted().distinct().toList();
    }
    public static Map<String,List<Integer>> getGramms(int gramLength,String text){
        Map<String,List<Integer>> result = new HashMap<>();
        for(int i = 0;i<text.length()-gramLength+1;i++) {
            String sub = text.substring(i,i+gramLength);
            if (result.containsKey(sub)){
                List<Integer> value = result.get(sub);
                value.add(i);
                result.put(sub,value);
            }
            else{
                List<Integer> value = new ArrayList<>();
                value.add(i);
                result.put(sub,value);
            }
        }

        return result;
    }
}
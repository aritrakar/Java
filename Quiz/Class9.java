import java.util.Scanner;
class Class9{
    public static Scanner i = new Scanner(System.in);
    public static void English(){   
        int eng_counter=0;
        String[][] q = new String[10][5]; 
        String[] key = new String[10];
        q[0][0]= "___ difficult the problem is, one musn't lose hope."; 
        q[0][1]= "A.Whether"; q[0][2]= "B.However"; q[0][3]= "C.As far as"; q[0][4]= "D.Though";key[0] = "B";
        q[1][0]= "Where can I check ___ for the flight to Hong Kong?"; 
        q[1][1]= "A.for"; q[1][2]= "B.out"; q[1][3]= "C.with"; q[1][4]= "D.in";key[1] = "D";
        q[2][0]= "Sourav is a very unsocial person so ___ people know him well."; 
        q[2][1]= "A.many"; q[2][2]= "B.a few"; q[2][3]= "C.few"; q[2][4]= "D.noone";key[2] = "C";
        q[3][0]= "Synonym of smear "; 
        q[3][1]= "A.encourage"; q[3][2]= "B.quarrel"; q[3][3]= "C.avoid"; q[3][4]= "D.mark";key[3] = "D";
        q[4][0]= "The antonym of blatant is"; 
        q[4][1]= "A.noisy"; q[4][2]= "B.quiet"; q[4][3]= "C.barren"; q[4][4]= "D.slow";key[4] = "B";
        q[5][0]= "In old days the king was considered 'all powerful'. Replace ;'all powerful' with "; 
        q[5][1]= "A.veteran"; q[5][2]= "B.omnipotent"; q[5][3]= "C.omnivorous"; q[5][4]= "D.omniscient";key[5] = "B";
        q[6][0]= "Abscence makes the heart grow ___"; 
        q[6][1]= "A.ponder"; q[6][2]= "B.fonder"; q[6][3]= "C.corner"; q[6][4]= "D.laughter";key[6] = "B";
        q[7][0]= "The picnic was good fun ___?"; 
        q[7][1]= "A.was it"; q[7][2]= "B.wasn't it"; q[7][3]= "C.were it"; q[7][4]= "D.weren't it";key[7] = "B";
        q[8][0]= "They played with";
        q[8][1]= "A.yourselves"; q[8][2]= "B.themselves"; q[8][3]= "C.itself"; q[8][4]= "D.himself"; key[8] = "B";
        q[9][0]= "It was raining cats and dogs and we didn't enjoy ___"; 
        q[9][1]= "A.himself"; q[9][2]= "B.themselves"; q[9][3]= "C.herself"; q[9][4]= "D.ourselves";key[9] = "D";
        for(int j=0;j<10;j++){
            System.out.println((j+1)+"."+q[j][0]);
            System.out.println("Options: "+q[j][1]+"\t"+q[j][2]+"\n\t "+q[j][3]+"\t"+q[j][4]);
            System.out.print("Answer:");
            String ans = i.nextLine();
            if(ans.equals(key[j])){ System.out.println("Correct!");eng_counter++;}else{System.out.println("Incorrect.The correct answer is "+key[j]);}
        }
        if(eng_counter<=4){System.out.print("You got "+eng_counter+" correct. Looks like you need to work harder..."); }
        else if((eng_counter < 8) && (eng_counter>=5)){System.out.print("Well done!You got "+eng_counter+" correct.");}
        else if((eng_counter <= 10) && (eng_counter>=8)){System.out.print("Great work! You got all correct!");}
    }
    public static void Math(){   
        int math_counter=0;
        String[][] q = new String[10][5]; 
        String[] key = new String[10]; 
        q[0][0]= "What is the intersection of 3 medians of a triangle called?"; 
        q[0][1]= "A.Centre"; q[0][2]= "B.Centroid"; q[0][3]= "C.Incentre"; q[0][4]= "D.Circumcentre";key[0] = "B";
        q[1][0]= "What is the value of log100 * log100000?"; 
        q[1][1]= "A.7"; q[1][2]= "B.10000000"; q[1][3]= "C.10"; q[1][4]= "D.7000";key[1] = "C";
        q[2][0]= "If you roll a die, what are the chances of an odd number facing up?"; 
        q[2][1]= "A.3/2"; q[2][2]= "B.1/2"; q[2][3]= "C.2/3"; q[2][4]= "D.1/4";key[2] = "B";
        q[3][0]= "What is the length of the diagonal of a cuboid with dimensions 3x4x5?";
        q[3][1]= "A.√50"; q[3][2]= "B.√31 + √9"; q[3][3]= "C.√34 + √16"; q[3][4]= "D.144";key[3] = "A";
        q[4][0]= "What is the formula of the diagonal of a cube?"; 
        q[4][1]= "A.3*Length of side"; q[4][2]= "B.√(3+Length of side)"; q[4][3]= "C.√(3*Length of side)"; q[0][4]= "D.√3*Length of side";key[4] = "";
        q[5][0]= "What is the value of cos60° + sin30° + tan45°?"; 
        q[5][1]= "A.135"; q[5][2]= "B.2"; q[5][3]= "C.1"; q[5][4]= "D.1.5";key[5] = "B";
        q[6][0]= "What is the area of a triangle with 3cm,4cm and 5cm as its sides?";
        q[6][1]= "A.60"; q[6][2]= "B.35"; q[6][3]= "C.12"; q[6][4]= "D.6";key[6] = "D";
        q[7][0]= "What is the area of a paralellogram lying on the same base as a triangle whose area is 69 cm^2?"; 
        q[7][1]= "A.71"; q[7][2]= "B.138"; q[7][3]= "C.39.5"; q[7][4]= "D.67";key[7] = "B";
        q[8][0]= "Which of the following is NOT a type of congruency?";
        q[8][1]= "A.AAS"; q[8][2]= "B.ASA"; q[8][3]= "C.AAA"; q[8][4]= "D.RHS";key[8] = "C";
        q[9][0]= "What is the slope of the line passing between the points (8,28) and (28,20)?"; 
        q[9][1]= "A.-0.6"; q[9][2]= "B.0.75"; q[9][3]= "C.1.3"; q[9][4]= "D.1";key[9] = "A";
        for(int j=0;j<10;j++){
            System.out.println((j+1)+"."+q[j][0]);
            System.out.println("Options: "+q[j][1]+"\t"+q[j][2]+"\n\t "+q[j][3]+"\t"+q[j][4]);
            System.out.print("Answer:");
            String ans = i.nextLine();
            if(ans.toUpperCase().equals(key[j])){ System.out.println("Correct!");math_counter++;}else{System.out.println("Incorrect.The correct answer is "+key[j]);}
        }
        if(math_counter<=3){System.out.print("You got "+math_counter+" correct. Looks like you need to work harder..."); }
        else if((math_counter < 8) && (math_counter>=5)){System.out.print("Well done!You got "+math_counter+" correct.");}
        else if((math_counter <= 10) && (math_counter>=8)){System.out.print("Great work! You got all correct!");}
    }
    public static void Physics(){   
        int phy_counter=0;
        String[][] q = new String[10][5]; 
        String[] key = new String[10]; 
        q[0][0]= "Sound waves are ___ waves"; 
        q[0][1]= "A.Transverse"; q[0][2]= "B.Longitudinal"; q[0][3]= ""; q[0][4]= ""; key[0] = "B";
        q[1][0]= "Newton's laws of motion were inspired by ___'s idea of motion";
        q[1][1]= "A.Galileo Galilei"; q[1][2]= "B.Rene Descartes";q[1][3]= "C.Johannes Kepler"; q[1][4]= "D.Archimedes"; key[1] = "A";
        q[2][0]= "Natural magnets are more commonly known as ___"; 
        q[2][1]= "A.Temporary magnets"; q[2][2]= "B.Permanent magnets"; q[2][3]= "Lodestone"; q[2][4]= "D.Magnesia";key[2] = "C";
        q[3][0]= "Planetary laws of motion were devised by ___"; 
        q[3][1]= "A.Issac Newton"; q[3][2]= "B.Albert Einstein"; q[3][3]= "C.Nicolaus Copernicus"; q[3][4]= "D.Johannes Kepler";key[3] = "D";
        q[4][0]= "What is the SI unit of light?"; 
        q[4][1]= "A.Lumen"; q[4][2]= "B.Candela"; q[4][3]= "C.Photon"; q[4][4]= "D.Photovolts";key[4] = "B";
        q[5][0]= "What is used to measure the current in a circuit?"; 
        q[5][1]= "A.Voltmeter"; q[5][2]= "B.Galvanometer"; q[5][3]= "C.Ammeter"; q[5][4]= "D.Capacitor";key[5] = "C";
        q[6][0]= "The amount of heat required to raise unit mass of a substance by 1°C is known as ___ ";
        q[6][1]= "A.Latent heat"; q[6][2]= "B.Specific heat Capacity"; q[6][3]= "C.Heat Cpacity"; q[6][4]= "D.Specific Latent Heat";key[6] = "B";
        q[7][0]= "The space left above mercury column in a barometer is called "; 
        q[7][1]= "A.Barometric height"; q[7][2]= "B.Faulty Barometric height"; q[7][3]= "C.Toricellian Vacuum"; q[7][4]= "D.Simple barometric height";key[7] = "C";
        q[8][0]= "When a body slides over a rough surface a force starts acting in the body in the direction opposite to the motion of the body. Name it."; 
        q[8][1]= "A.Limiting friction"; q[8][2]= "B.Normal Reaction Force"; q[8][3]= "C.Sliding friction"; q[8][4]= "D.Gravitaional Force";key[8] = "C";
        q[9][0]= "Which of the floowing isn't a property of the magnetic field lines?";
        q[9][1]= "A.Closed, continuous curves"; q[9][2]= "B.Tangent at any point givens direction"; q[9][3]= "C.Intersecting"; q[9][4]= "D.Behave like stretched elastic rubber strings";key[9] = "C";
        for(int j=0;j<10;j++){
            System.out.println((j+1)+"."+q[j][0]);
            System.out.println("Options: "+q[j][1]+"\t"+q[j][2]+"\n\t "+q[j][3]+"\t"+q[j][4]);
            System.out.print("Answer:");
            String ans = i.nextLine();
            if(ans.toUpperCase().equals(key[j])){ System.out.println("Correct!");phy_counter++;}else{System.out.println("Incorrect. The correct answer is "+key[j]);}
        }
        if(phy_counter<=3){System.out.print("You got "+phy_counter+" correct. Looks like you need to work harder..."); }
        else if((phy_counter < 8) && (phy_counter>=5)){System.out.print("Well done!You got "+phy_counter+" correct.");}
        else if((phy_counter <= 10) && (phy_counter>=8)){System.out.print("Great work! You got all correct!");}
    }
    public static void Chemistry(){   
        int chem_counter=0;
        String[] key = new String[10]; 
        String[][] q = new String[10][5]; 
        q[0][0]= "Which of the following chemists did NOT have anything to do with classification of elements?"; 
        q[0][1]= "A.Dobereiner"; q[0][2]= "B.Boyle"; q[0][3]= "C.Newland"; q[0][4]= "D.Mendeleev";key[0] = "B";
        q[1][0]= "Which of the following is an example of a substance that undergoes pseudo sublimation?"; 
        q[1][1]= "A.Solid CO2"; q[1][2]= "B.Iodine crystals"; q[1][3]= "C.Naphthalene"; q[1][4]= "D.NH4Cl";key[1] = "D";
        q[2][0]= "White hot coke reacts with suer heated steam to produce ___"; 
        q[2][1]= "A.Bio gas"; q[2][2]= "B.Hydrocarbon"; q[2][3]= "C.Water gas"; q[2][4]= "D.Carbonic acid";key[2] = "C";
        q[3][0]= "Which of the following scientists are NOT associtated with the discovery of subatomic particles?";
        q[3][1]= "A.Gay-Lussac"; q[3][2]= "B.Ernest Rutherford"; q[3][3]= "C.Niels Bohr"; q[3][4]= "D.James Chadwick";key[3] = "A";
        q[4][0]= "The formula for the maimum no. of electrons in the valence shell is";
        q[4][1]= "A.n+2"; q[4][2]= "B.(2n)^2"; q[4][3]= "C.4n"; q[4][4]= "D.2n^2";key[4] = "D";
        q[5][0]= "Elements of group VIIA of the Modern Periodic Table is also known as ___";
        q[5][1]= "A.Noble gases"; q[5][2]= "B.Halogens"; q[5][3]= "C.Rare earth metals"; q[5][4]= "D.Transition elements";key[5] = "B";
        q[6][0]= "Which is the longest period?";
        q[6][1]= "A.7"; q[6][2]= "B.4"; q[6][3]= "C.6"; q[6][4]= "D.5";key[6] = "C";
        q[7][0]= "How can you remove permanent hardness of water?"; 
        q[7][1]= "A.By adding washing soda"; q[7][2]= "B.By adding chlorine"; q[7][3]= "C.By boiling it"; q[7][4]= "D.By treating it with UV rays"; key[7] = "A";
        q[8][0]= "Who discovered Hydrogen?";
        q[8][1]= "A.Lavoisier"; q[8][2]= "B.Berzelius"; q[8][3]= "C.Paracelsus"; q[8][4]= "D.Cavendish";key[8] = "D";
        q[9][0]= "The Actinide series are found in which Period?";
        q[9][1]= "A.7th"; q[9][2]= "B.6th"; q[9][3]= "C.5th"; q[9][4]= "D.2nd";key[9] = "B";
        for(int j=0;j<10;j++){
            System.out.println((j+1)+"."+q[j][0]);
            System.out.println("Options: "+q[j][1]+"\t"+q[j][2]+"\n\t "+q[j][3]+"\t"+q[j][4]);
            System.out.print("Answer:");
            String ans = i.nextLine();
            if(ans.toUpperCase().equals(key[j])){ System.out.println("Correct!");chem_counter++;}else{System.out.println("Incorrect. The correct answer is "+key[j]); }
        }
        if(chem_counter<=3){System.out.print("You got "+chem_counter+" correct. Looks like you need to work harder..."); }
        else if((chem_counter < 8) && (chem_counter>=5)){System.out.print("Well done!You got "+chem_counter+" correct.");}
        else if((chem_counter <= 10) && (chem_counter>=8)){System.out.print("Great work! You got all correct!");}
    }
    public static void Biology(){  
        int bio_counter=0;
        String[] key = new String[10]; 
        String[][] q = new String[10][5]; 
        q[0][0]= "How many chromosomes are there in the human DNA?"; 
        q[0][1]= "A.23 pair"; q[0][2]= "B.43"; q[0][3]= "C.26"; q[0][4]= "D.46";key[0] = "A";
        q[1][0]= "What is the change of DNA to RNA called?"; 
        q[1][1]= "A.Direct Translation"; q[1][2]= "B.Translation"; q[1][3]= "C.Reverse Transcription"; q[1][4]= "D.Trasncription";key[1] = "D";
        q[2][0]= "What is angina pectoris?";
        q[2][1]= "A.Lung disease"; q[2][2]= "B.Heart ache"; q[2][3]= "C.Bone disease"; q[2][4]= "D.Heart attack";key[2] = "B";
        q[3][0]= "Which part of the brain controls heart beats and breathing?";
        q[3][1]= "A.Pituitary gland"; q[3][2]= "B.Cerebellum"; q[3][3]= "C.Medulla oblongota"; q[3][4]= "D.Cerebrum";key[3] = "C";
        q[4][0]= "What is the last part of the small intestine called?";
        q[4][1]= "A.Duodenum"; q[4][2]= "B.Ileum"; q[4][1]= "C."; q[4][2]= "D.";key[4] = "B";
        q[5][0]= "What comes after Genus?"; 
        q[5][1]= "A.Species"; q[5][2]= "B.Family"; q[5][3]= "C.Order"; q[5][4]= "D.Phylum";key[5] = "A";
        q[6][0]= "What are the muscles between the ribs called?"; 
        q[6][1]= "A.Inter-thoracic muscles"; q[6][2]= "B."; q[6][3]= "C.Cardiac muscles"; q[6][4]= "D.Intercostal muscles";key[6] = "D";
        q[7][0]= "What is DDT?"; 
        q[7][1]= "A.Type of manure"; q[7][2]= "B.Fertilizer"; q[7][3]= "C.Pesticide"; q[7][4]= "D.Rodenticide";key[7] = "C";
        q[8][0]= "Respiration is a ___ process"; 
        q[8][1]= "A.Catabolic"; q[8][2]= "B.Anabolic"; q[8][3]= "C.Spontaneous"; q[8][4]= "D.Slow";key[8] = "A";
        q[9][0]= "What are the finger-like extensions in mitochondria called?"; 
        q[9][1]= "A.Cylia"; q[9][2]= "B.Cristae";q[9][3]= "C.Pseudopodia"; q[9][4]= "D.Papilla"; key[9] = "B";
        for(int j=0;j<10;j++){
            System.out.println((j+1)+"."+q[j][0]);
            System.out.println("Options: "+q[j][1]+"\t"+q[j][2]+"\n\t "+q[j][3]+"\t"+q[j][4]);
            System.out.print("Answer:");
            String ans = i.nextLine();
            if(ans.toUpperCase().equals(key[j])){ System.out.println("Correct!");bio_counter++;}else{System.out.println("Incorrect.The correct answer is "+key[j]);}
        }
        if(bio_counter<=3){System.out.print("You got "+bio_counter+" correct. Looks like you need to work harder..."); }
        else if((bio_counter < 8) && (bio_counter>=5)){System.out.print("Well done!You got "+bio_counter+" correct.");}
        else if((bio_counter <= 10) && (bio_counter>=8)){System.out.print("Great work! You got all correct!");}
    }
    public static void History(){   
        int hist_counter=0;
        String[] key = new String[10]; 
        String[][] q = new String[10][5]; 
        q[0][0]= "Which Vedic God is also referred to as 'Purandara' or 'breaker of forts'?"; 
        q[0][1]= "A.Shiva"; q[0][2]= "B.Indra"; q[0][3]= "C.Vishnu"; q[0][4]= "D.Agni"; key[0] = "B";
        q[1][0]= "Which of the following is a Buddhist text?"; 
        q[1][1]= "A.Brahmanas"; q[1][2]= "B.Manusmriti"; q[1][3]= "C.Jatakas"; q[1][4]= "D.Arthashastra"; key[1] = "C";
        q[2][0]= "Under Mauryan central administration, the post 'Sannidhata' meant"; 
        q[2][1]= "A.Taxation Expert"; q[2][2]= "B.Treasurer"; q[2][3]= "C.Prime Minister"; q[2][4]= "D.King"; key[2] = "B";
        q[3][0]= "Which of these architectural pieces wasn't built by Shah Jahan?"; 
        q[3][1]= "A.Jama Masjid"; q[3][2]= "B.Taj Mahal"; q[3][3]= "C."; q[3][4]= "D.Moti Masjid"; key[3] = "D";
        q[4][0]= "Which Delhi sultan earned the title of 'Lakhbaksh'?"; 
        q[4][1]= "A.Babur"; q[4][2]= "B.Balban"; q[4][3]= "C.Qutbuddin Aibak"; q[4][4]= "D.Aurangzeb"; key[4] = "A";
        q[5][0]= "The ruins of which Indian university is found in present day Bihar?";
        q[5][1]= "A.Takshila"; q[5][2]= "B.Nalanda"; q[5][3]= "C."; q[5][4]= "D."; key[5] = "B";
        q[6][0]= "Which of the following dates isn't important regarding the voyages of discovery?";
        q[6][1]= "A.1492"; q[6][2]= "B.1455"; q[6][3]= "C.1500"; q[6][4]= "D.1460"; key[6] = "A";
        q[7][0]= "This term is related to Akbar's new religion Din-i-ilahi"; 
        q[7][1]= "A.Mazhar"; q[7][2]= "B.Sulh-i-kul"; q[7][3]= "C.Jizyah"; q[7][4]= "D.Ibadat Khana"; key[7] = "D";
        q[8][0]= "The Allahabad inscriptions talks about this ancient Indian ruler"; 
        q[8][1]= "A.Samudragupta"; q[8][2]= "B.Ashoka"; q[8][3]= "C.Chandragupta"; q[8][4]= "D.Raja Raja Chola I"; key[8] = "A";
        q[9][0]= "What were the religious expeditionary wars during the Renaissance called?"; 
        q[9][1]= "A.Jihad"; q[9][2]= "B.Crusades"; q[9][3]= "C."; q[9][4]= "D.";  key[9] = "B";
        for(int j=0;j<10;j++){
            System.out.println((j+1)+"."+q[j][0]);
            System.out.println("Options: "+q[j][1]+"\t"+q[j][2]+"\n\t "+q[j][3]+"\t"+q[j][4]);
            System.out.print("Answer:");
            String ans = i.nextLine();
            if(ans.toUpperCase().equals(key[j])){ System.out.println("Correct!");hist_counter++;}else{System.out.println("Incorrect.The correct answer is "+key[j]);}
        }
        if(hist_counter<=3){System.out.print("You got "+hist_counter+" correct. Looks like you need to work harder..."); }
        else if((hist_counter < 8) && (hist_counter>=5)){System.out.print("Well done!You got "+hist_counter+" correct.");}
        else if((hist_counter <= 10) && (hist_counter>=8)){System.out.print("Great work! You got all correct!");}
    }
    public static void Geography(){   
        int geo_counter=0;
        String[] key = new String[10]; 
        String[][] q = new String[10][5]; 
        q[0][0]= "Westerlies are best developed between ";
        q[0][1]= "A.35°S-65°S"; q[0][2]= "B.0°-35°N"; q[0][3]= "C.35°N-65°N"; q[0][4]= "D.65°S-75°S";key[0] = "A";
        q[1][0]= "The boundary between the mantle and the core is called ___"; 
        q[1][1]= "A.Mohovicic discontinuity"; q[1][2]= "B.Barysphere"; q[1][3]= "C.Gutenberg discontinuity"; q[1][4]= "D.Lithosphere";key[1] = "C";
        q[2][0]= "Which of the following is not a cold current?";
        q[2][1]= "A.Canary"; q[2][2]= "B.Benguela"; q[2][3]= "C.Brazil"; q[2][4]= "D.Labrador";key[2] = "C";
        q[3][0]= "The coldest layer of the atmosphere is";
        q[3][1]= "A.Exosphere"; q[3][2]= "B.Thermosphere"; q[3][3]= "C.Stratosphere"; q[3][4]= "D.Mesosphere";key[3] = "D";
        q[4][0]= "The colourful lights seen in the night sky near the North Pole is known as ";
        q[4][1]= "A.Aurora Australis."; q[4][2]= "B.Aurora Borealis."; q[4][3]= "C.Northern Illumination"; q[4][4]= "D.Arctic Illumination";key[4] = "B";
        q[5][0]= "Temperature in the atmosphere reduces at a rate of";
        q[5][1]= "A.2°/10m"; q[5][2]= "B.1°/10m"; q[5][3]= "C.2°/165"; q[5][4]= "D.1°/165m";key[5] = "D";
        q[6][0]= "Which of the following isn't another name for tropical grasslands?";
        q[6][1]= "A.Savanna"; q[6][2]= "B.Campos"; q[6][3]= "C.Gran Chaco"; q[6][4]= "D.Steppes";key[6] = "D";
        q[7][0]= "Process of horizontal transfer of heat by wind is known as "; 
        q[7][1]= "A.Convection"; q[7][2]= "B.Advection"; q[7][3]= "C.Conduction"; q[7][4]= "D.Radiation";key[7] = "B";
        q[8][0]= "Full form fo CFC";
        q[8][1]= "A.Carbocluorochlorine"; q[8][2]= "B.Carbon fixated chlorine"; q[8][3]= "C.Carbondioxide fixated chlorine"; q[8][4]= "D.Chlorofluorocarbon";key[8] = "D";
        q[9][0]= "Which of the following isn't a volatile hydrocarbon causing air pollution?"; 
        q[9][1]= "A.Methane"; q[9][2]= "B.Acetylene"; q[9][3]= "C.Carbon monoxide"; q[9][4]= "D.Ethylene";key[9] = "C";
        for(int j=0;j<10;j++){
            System.out.println((j+1)+"."+q[j][0]);
            System.out.println("Options: "+q[j][1]+"\t"+q[j][2]+"\n\t "+q[j][3]+"\t"+q[j][4]);
            System.out.print("Answer:");
            String ans = i.nextLine();
            if(ans.toUpperCase().equals(key[j])){ System.out.println("Correct!");geo_counter++;}else{System.out.println("Incorrect.The correct answer is "+key[j]);}
        }
        if(geo_counter<=3){System.out.print("You got "+geo_counter+" correct. Looks like you need to work harder..."); }
        else if((geo_counter < 8) && (geo_counter>=5)){System.out.print("Well done!You got "+geo_counter+" correct.");}
        else if((geo_counter <= 10) && (geo_counter>=8)){System.out.print("Great work! You got all correct!");}
    }
    public static void Computer(){   
        int comp_counter=0;
        String[] key = new String[10]; 
        String[][] q = new String[10][5]; 
        q[0][0]= "DNS is an acronym for "; 
        q[0][1]= "A.Domain Name System"; q[0][2]= "B.Domain Number Security"; q[0][3]= "D.Domain Number System"; q[0][4]= "C.Domain Name Security";key[0] = "A";
        q[1][0]= "Which science fiction author came up with the three laws of robotics?"; 
        q[1][1]= "A.Arthur C. Clarke"; q[1][2]= "B.Isaac Asimov"; q[1][3]= "C.Michael Critchon"; q[1][4]= "D.Jules Verne";key[1] = "B";
        q[2][0]= "Every computer on the Internet has a unique 4 part numeric address that identifies it.Name it."; 
        q[2][1]= "A.IMEI number"; q[2][2]= "B.MAC address"; q[2][3]= "C.Subscriber Index"; q[2][4]= "D.Internet Protocol";key[2] = "D";
        q[3][0]= "The function of a ___ is to make connections between different systems on the Internet."; 
        q[3][1]= "A.Modem"; q[3][2]= "B.Router"; q[3][3]= "C.Switch"; q[3][4]= "D.Firewall";key[3] = "B";
        q[4][0]= ".mkv format is used to store what?"; 
        q[4][1]= "A.Text"; q[4][2]= "B.Audio and Video"; q[4][3]= "C.Database"; q[4][4]= "D.Configuration Files";key[4] = "B";
        q[5][0]= "Expand MODEM."; 
        q[5][1]= "A.Modulator Demodulator"; q[5][2]= "B.Modular Electromagnetic waves"; q[5][3]= "C.Minimised EM waves"; q[5][4]= "D.Maximised EM waves";key[5] = "A";
        q[6][0]= "If you want to make your computer faster, which should you change?"; 
        q[6][1]= "A.GPU"; q[6][2]= "B.ROM"; q[6][3]= "C.Fan"; q[6][4]= "D.RAM";key[6] = "D";
        q[7][0]= "What is the return type of a constructor?"; 
        q[7][1]= "A.int"; q[7][2]= "B.void"; q[7][3]= "C.boolean"; q[7][4]= "D.String";key[7] = "B";
        q[8][0]= "Which of the following is a network authentication technique?"; 
        q[8][1]= "A.SSH"; q[8][2]= "B.SSL"; q[8][3]= "C.WPA2"; q[8][4]= "D.Token";key[8] = "C";
        q[9][0]= "What is IPv4?"; 
        q[9][1]= "A.A Protocol"; q[9][2]= "B.A version of IP"; q[9][3]= "C.Glass cover for phones"; q[9][4]= "D.Waterproof coating for phones"; key[9] = "A";
        for(int j=0;j<10;j++){
            System.out.println((j+1)+"."+q[j][0]);
            System.out.println("Options: "+q[j][1]+"\t"+q[j][2]+"\n \t"+q[j][3]+"\t"+q[j][4]);
            System.out.print("Answer:");
            String ans = i.nextLine();
            if(ans.toUpperCase().equals(key[j])){ System.out.println("Correct!");comp_counter++;}else{System.out.println("Incorrect.The correct answer is "+key[j]);}
        }
        if(comp_counter<=4){ System.out.print("You got "+comp_counter+" correct. Looks like you need to work harder..."); }
        else if((comp_counter<=7) && (comp_counter>=5)){System.out.print("Well done!You got "+comp_counter+" correct.");}
        else if((comp_counter<=10) && (comp_counter>=8)){System.out.print("Great work! You got all correct!");}
    }
}
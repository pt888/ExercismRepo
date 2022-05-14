class RnaTranscription {

    String transcribe(String dnaStrand) {
        int s=dnaStrand.length();
        String rna="";
        for(int i=0;i<s;i++){            
            if(dnaStrand.charAt(i)=='G') rna+="C";
            if(dnaStrand.charAt(i)=='C') rna+="G";
            if(dnaStrand.charAt(i)=='T') rna+="A";
            if(dnaStrand.charAt(i)=='A') rna+="U";
        }
        return rna;
   }

}

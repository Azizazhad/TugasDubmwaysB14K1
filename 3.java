<script language="JavaScript">
    var bil=40;
    var prima=false;
    
    document.write("Bilangan Prima antara 1 sampai dengan"+" "+bil+" "+"adalah"+" "+":"+"<br>");
    for (i=2; i<=bil; i++){
        if(i>=2){
        prima =true;
            for(j=2; j<i; j++){
            if(i%j==0){
                prima=false;
            }
            }
        }
        if(prima==true){
        document.write(i+',');
        }
    }
 </script>
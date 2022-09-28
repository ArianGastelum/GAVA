/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.curp.negocio;

/**
 * Contiene métodos para generar el curp en base a la información personal
 * @author Arian Gastelum
 */
public class Curp {
    /**
     * Convierte la información personal proporcionada en una concatenación y los organiza para formar la CURP
     * @param nombre
     * @param apellidoPaterno
     * @param apellidoMaterno
     * @param dia
     * @param mes
     * @param año
     * @param estado
     * @param sexo
     * @return Los datos de la persona concatenados formando el CURP
     */
    public String generarCurp (String nombre, String apellidoPaterno, String apellidoMaterno, String dia, String mes, String año, String estado, String sexo){
        //Se almacenan los nombres y apellidos en un arreglo de tipo char
        
        char[] letrasApellidoP = apellidoPaterno.toCharArray();
        char[] letrasApellidoM = apellidoMaterno.toCharArray();
        char[] letrasNombre = nombre.toCharArray();
        char primerLetraP = letrasApellidoP[0];
        char primerLetraM = letrasApellidoM[0];
        String vacioM = String.valueOf(primerLetraM);
        
        
       
        //Se determina si nacio despues del 2000 
        int añoNacimiento = Integer.parseInt(año);
        String penultimoCaracter = "";
        if(añoNacimiento>=2000){
            penultimoCaracter = "A";
        }else{
            penultimoCaracter = "0";
        }
        //Se busca la primera vocal interna del primer apellido
        char caracter2 = '0';
         for(int i = 1 ;letrasApellidoP.length>=0;i++){
         if(letrasApellidoP[i] == 'A'|| letrasApellidoP[i] == 'E' || letrasApellidoP[i] == 'U' || letrasApellidoP[i] == 'O' || letrasApellidoP[i] == 'I' ){
          caracter2 = letrasApellidoP[i];
          break;
         
         }}
         //Se busca la primera consonante del primer apellido
         char consonanteApellidoP = '0';
         for(int j = 1 ;letrasApellidoP.length>=0;j++){
         if(letrasApellidoP[j] == 'B'|| letrasApellidoP[j] == 'C' || letrasApellidoP[j] == 'D' || letrasApellidoP[j] == 'F' || letrasApellidoP[j] == 'G' 
            || letrasApellidoP[j] == 'H'|| letrasApellidoP[j] == 'J' || letrasApellidoP[j] == 'K' || letrasApellidoP[j] == 'L' || letrasApellidoP[j] == 'M'
                 || letrasApellidoP[j] == 'N'|| letrasApellidoP[j] == 'P' || letrasApellidoP[j] == 'Q' || letrasApellidoP[j] == 'R' || letrasApellidoP[j] == 'S'
                 || letrasApellidoP[j] == 'T'|| letrasApellidoP[j] == 'V' || letrasApellidoP[j] == 'W' || letrasApellidoP[j] == 'X' || letrasApellidoP[j] == 'T' || letrasApellidoP[j] == 'Z'){
          consonanteApellidoP = letrasApellidoP[j];
          break;
         
         }
         }
         //Se busca la primera consonante del segundo apellido
         char consonanteApellidoM = '0';
         for(int k = 1 ;letrasApellidoM.length>=0;k++){
         if(letrasApellidoM[k] == 'B'|| letrasApellidoM[k] == 'C' || letrasApellidoM[k] == 'D' || letrasApellidoM[k] == 'F' || letrasApellidoM[k] == 'G' 
            || letrasApellidoM[k] == 'H'|| letrasApellidoM[k] == 'J' || letrasApellidoM[k] == 'K' || letrasApellidoM[k] == 'L' || letrasApellidoM[k] == 'M'
                 || letrasApellidoM[k] == 'N'|| letrasApellidoM[k] == 'P' || letrasApellidoM[k] == 'Q' || letrasApellidoM[k] == 'R' || letrasApellidoM[k] == 'S'
                 || letrasApellidoM[k] == 'T'|| letrasApellidoM[k] == 'V' || letrasApellidoM[k] == 'W' || letrasApellidoM[k] == 'X' || letrasApellidoM[k] == 'T' || letrasApellidoM[k] == 'Z'){
          consonanteApellidoM = letrasApellidoM[k];
          break;
         
         }
         }
         //Se busca la primera consonante del nombre
         char consonanteNombre = '0';
         for(int l = 1 ;letrasNombre.length>=0;l++){
         if(letrasNombre[l] == 'B'|| letrasNombre[l] == 'C' || letrasNombre[l] == 'D' || letrasNombre[l] == 'F' || letrasNombre[l] == 'G' 
            || letrasNombre[l] == 'H'|| letrasNombre[l] == 'J' || letrasNombre[l] == 'K' || letrasNombre[l] == 'L' || letrasNombre[l] == 'M'
                 || letrasNombre[l] == 'N'|| letrasNombre[l] == 'P' || letrasNombre[l] == 'Q' || letrasNombre[l] == 'R' || letrasNombre[l] == 'S'
                 || letrasNombre[l] == 'T'|| letrasNombre[l] == 'V' || letrasNombre[l] == 'W' || letrasNombre[l] == 'X' || letrasNombre[l] == 'T' || letrasNombre[l] == 'Z'){
          consonanteNombre = letrasNombre[l];
          break;
         
         }
         }
         //Se convierte los caracteres de tipo char a una cadena de String
        String letra2 = String.valueOf(caracter2);
        String primerConsonanteP = String.valueOf(consonanteApellidoP);
        String primerConsonanteM = String.valueOf(consonanteApellidoM);
        String primerConsonanteN = String.valueOf(consonanteNombre);
       
        
        
         //Se toman las posiciones de datos que se requieren
        nombre = nombre.substring(0,1);
        año = año.substring(2, 4);
        //Se concatenan los datos de la fecha de nacimiento
        String fecha = año + mes + dia;
        //Evalua si es hombre o mujer
        if (sexo.equals("Hombre")){
            sexo = "H";    
        }else {
            sexo = "M";
        }
        //Evalua el estado de nacimiento y asigna su clave
        switch(estado)
        {
        case "AGUAS CALIENTES":
                 estado = "AS";      
               break;
        case "BAJA CALIFORNIA":
            estado = "BC";
            break;
        case "BAJA CALIFORNIA SUR":
            estado = "BS";
            break;
        case "CAMPECHE":
            estado = "CC";
            break;
        case "COAHUILA":
            estado = "CL";
            break;
        case "COLIMA":
            estado = "CM";
            break;
        case "CHIAPAS":
            estado = "CS";
            break;
        case "CHIHUAHUA":
            estado = "CH";
            break;
        case "DISTRITO FEDERAL":
            estado = "DF";
            break;
        case "DURANGO":
            estado = "DG";
            break;
        case "GUANAJUATO":
            estado= "GT";
            break;
        case "GUERRERO":
            estado = "GR";
            break;
        case "HIDALGO":
            estado = "HG";
            break;
        case "JALISCO":
            estado = "JC";
            break;
        case "ESTADO DE MEXICO":
            estado="MC";
            break;
        case "MICHOACÁN":
            estado="MN";
            break;
        case "MORELOS":
            estado="MS";
            break;
        case "NAYARIT":
            estado="NT";
            break;
        case "NUEVO LEÓN":
            estado="NL";
            break;
        case "OAXACA":
            estado="OC";
            break;
        case "PUEBLA":
            estado="PL";
            break;
        case "QUERÉTARO":
            estado="QT";
            break;
        case "QUINTANA ROO":
            estado="QR";
            break;
        case "SAN LUIS POTOSÍ":
            estado="SP";
            break;
        case "SINALOA":
            estado = "SL";
            break;
        case "SONORA":
            estado = "SR";
            break;
        case "TABASCO":
            estado = "TC";
            break;
        case "TAMAULIPAS":
            estado = "TS";
            break;
        case "TLAXCALA":
            estado ="TL";
            break;
        case "VERACRUZ":
            estado="VZ";
            break;
        case "YUCATÁN":
            estado="YN";
            break;
        case "ZACATECAS":
            estado="ZS";
            break;
           
        case "NACIDO EXTRANJERO":
            estado ="NE";
            break;
        }
        
        
        
        //Se concatenan todos los datos
        String curpEntero = primerLetraP + letra2 + primerLetraM + nombre + fecha + sexo + estado + primerConsonanteP + primerConsonanteM + primerConsonanteN + penultimoCaracter + "1";
        return curpEntero;
        }
    
    }
    
/**
 *
 * @author ArianGastelum
 *  apellidoPaterno = apellidoPaterno.substring(0,2);
        
               
        if (apellidoMaterno ==null) {
            apellidoMaterno = "X";
        }else {
        apellidoMaterno = apellidoMaterno.substring(0,1);   
        }
 */

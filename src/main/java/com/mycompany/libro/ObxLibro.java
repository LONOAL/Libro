
package com.mycompany.libro;


/**
 *
 * @author PC-LORENZO
 */
public class ObxLibro {
     //Declaro los atributos
        private String titulo;
        private String autor;
        private int ano;
        private short numPaginas;
        private float valoracion;
        
        
        public ObxLibro (String titulo, String autor, int ano, short numPaginas){
            this.titulo= titulo;
            this.autor= autor;
            this.ano= ano;
            this.numPaginas= numPaginas;
        }
        public ObxLibro (){
        }

        public void setTitulo (String ti){
            titulo= ti;
        }
        
        public String getTitulo (){
            return titulo;
        }
        
        public void setAutor (String aut){
            autor= aut;
        }
        
        public String getAutor (){
            return autor;
        }
        
        public void setAno (int an){
            ano= an;
        }
        
        public int getAno (){
            return ano;
        }
        
        public void setNumPaginas (short num){
            numPaginas= num;
        }
        
        public short getNumPaginas (){
            return numPaginas;
        }
       
        public void setValoracion (float val){
            valoracion= val;
        }
        
        public float getValoracion (){
            return valoracion;
        }
        public void amosar(){
           
        System.out.println("Titulo= "+titulo+"\nAutor= "+autor+"\nAno= "+ano+"\nPaginas= "+numPaginas);
        }
}
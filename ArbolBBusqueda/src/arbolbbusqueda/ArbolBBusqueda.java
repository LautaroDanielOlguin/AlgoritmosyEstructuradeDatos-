package arbolbbusqueda;
public class ArbolBBusqueda {
    public static void main(String[] args) {
        System.out.println("Arbol binario de busqueda de enteros\n");

        ArbolBinarioBusqueda arbolBinarioBusqueda = new ArbolBinarioBusqueda();
        try{
      
            arbolBinarioBusqueda.insertar(10);
            arbolBinarioBusqueda.insertar(15);
            arbolBinarioBusqueda.insertar(7);
            arbolBinarioBusqueda.insertar(3);
            arbolBinarioBusqueda.insertar(9);
            arbolBinarioBusqueda.insertar(1);
            arbolBinarioBusqueda.buscar(15);
            arbolBinarioBusqueda.eliminar(15);
      
            System.out.println("\npre orden");
            ArbolBinario.preorden(arbolBinarioBusqueda.rArbol());
            System.out.println("\nin orden");
            ArbolBinario.inorden(arbolBinarioBusqueda.rArbol());
            System.out.println("\npost orden");
            ArbolBinario.postorden(arbolBinarioBusqueda.rArbol());
      
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

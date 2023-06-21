package com.mycompany.grafos;

public class RecorrerGrafo {
    public static final int CLAVE = 0;
    public static int []recorrerAnchura(GrafoMatriz g, String org) throws Exception{
    int w, v;    
    int [] m;
    v = g.numVertice(org);
    
    if (v < 0) throw new Exception("Vértice origen no existe");
    
    ColaLista cola = new ColaLista();
    
    m = new int[v];
    for (int i = 0; i < v; i++)
      m[i] = CLAVE;
      m[v] = 0;
      cola.insertar(new Integer(v));
      while (! cola.colaVacia())
      {
        Integer cw;
        cw = (Integer) cola.quitar();
        w = cw.intValue();
        System.out.println("Vértice " + g.verts[w] + "visitado");
        for (int u = 0; u < g.numVerts; u++)
          if ((g.matAd[w][u] == 1) && (m[u] == CLAVE))
          {
            m[u] = m[w] + 1;
            cola.insertar(new Integer(u));
          }
      }
    return m;
    }
}

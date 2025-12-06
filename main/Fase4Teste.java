package main;

import model.*;

public class Fase4Teste {
    public static void main(String[] args) {
        CursoPresencial cp = new CursoPresencial("Engenharia", "ENG200", 320, "Sala 101");
        CursoEAD ce = new CursoEAD("Marketing Digital", "MD300", 120, "Plataforma Zoom/AVA");

        System.out.println("=== Fase 4 - Cursos diferenciados ===");
        System.out.println(cp.detalharCurso());
        System.out.println(ce.detalharCurso());
    }
}

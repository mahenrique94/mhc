package br.com.mhc.io;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.mhc.model.Cliente;
import br.com.mhc.model.Obra;

public class TestaScanner {

	public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<Cliente>();
        List<Obra> obras = new ArrayList<Obra>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite quantos clientes quer cadastrar:");
        int qnt = sc.nextInt();
        
    	for (int i = 0; i < qnt; i++) {
			System.out.println("Digite o nome do cliente:");
			Cliente c = new Cliente(sc.nextLine());
			clientes.add(c);
    	}
        sc.close();
        
        for (Cliente c : clientes) {
			System.out.println(c.getNome());
		}
	}

//        if(sc.hasNextLine()){
//                
//                if(sc.hasNextLine()) {    
//                    System.out.println("Entre com o nome da obra do cliente: ");
//                        if(sc.hasNextLine()){
//                            Obra o = new Obra(sc.nextLine());
//                            obras.add(o);
//                    }    
//                }
//            }
//        }    
//        
	
}

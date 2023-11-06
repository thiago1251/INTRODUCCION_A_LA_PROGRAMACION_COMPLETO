package math.pow;

public class mathpow {

	public static double main(String[] args) {
		// TODO Auto-generated method stub

		//Genera un número aleatorio entre un rango de enteros
		{
		    var numero = Math.floor( Math.random() * (3 - 1 + 1) + 1 );
		}

		var piedra = 0;
		var papel = 1;
		var tijera = 2;

		 var opciones = ["Piedra", "Papel", "Tijera"];

		var opcionUsuario;
		var opcionMaquina = patito(0,2);

		opcionUsuario = prompt("¿Qué eliges?\nPiedra: 0\nPapel: 1\nTijera: 2", 0);

		alert("Elegiste " + opciones[opcionUsuario]);
		alert("Javascript eligió " + opciones[opcionMaquina]);

		if(opcionUsuario == piedra)
		{
		    if(opcionMaquina == piedra)
		    {
		        alert("Empate!");
		    }
		    else if(opcionMaquina == papel)
		    {
		        alert("Perdiste :( ");
		    }
		    else if(opcionMaquina == tijera)
		    {
		        alert("Ganaste!");
		    }
		}
		else if(opcionUsuario == papel)
		{
		    if(opcionMaquina == piedra)
		    {
		        alert("Ganaste!");
		    }
		    else if(opcionMaquina == papel)
		    {
		        alert("Empate!");
		    }
		    else if(opcionMaquina == tijera)
		    {
		        alert("Perdiste!");
		    }
		}
		else if(opcionUsuario == tijera)
		{
		    if(opcionMaquina == piedra)
		    {
		        alert("Perdiste!");
		    }
		    else if(opcionMaquina == papel)
		    {
		        alert("Ganaste!");
		    }
		    else if(opcionMaquina == tijera)
		    {
		        alert("Empate!");
		    }
		}
		else
		{
		    alert("¿Pos qué carajo?");
		}
		
		
	}

	private static Object patito(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

}

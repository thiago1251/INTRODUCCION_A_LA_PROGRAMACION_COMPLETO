package conditionals;

import javax.swing.JOptionPane;

public class exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Vamos a calcular tu peso en otros planetas ¡LISTO!");
		String opcionUsuario = JOptionPane.showInputDialog(null, "¿En que planeta estas?\nMercurio: 1\nVenus: 2\nTierra: 3\n"
				                                               + "Marte: 4\nJupiter: 5\nSaturno: 6\nUrano: 7\nNeptuno: 8");
		String x = JOptionPane.showInputDialog("Ingresa tu peso en Kg");
		double masa = Double.parseDouble(x);
		int opUsuario = Integer.parseInt(opcionUsuario);
		System.out.print(opcionUsuario);
		
		if (opUsuario==1) {
			//gravedad de mercurio: 3,7m/s^2
			double mercurio = 3.7;
			//mercurio a venus   g=8.87
			double gMv = masa*8.87/mercurio;
			//mercurio a tierra   g=9,8
			double gMt = masa*9.8/mercurio;
			//mercurio a marte   g=3.7
			double gMm = masa*3.7/mercurio;
			//mercurio a jupiter   g=24,79
			double gMj = masa*24.79/mercurio;
			//mercurio a saturno   g=10,44
			double gMs = masa*10.44/mercurio;
			//mercurio a urano   g=8,87
			double gMu = masa*8.87/mercurio;
			//mercurio a neptuno   g=11,15
			double gMn = masa*11.15/mercurio;
			JOptionPane.showMessageDialog(null, "Tu peso en Mercurio es: " + masa + " Kg" + "\n"
					                          + "Tu peso en Venus es: " + gMv + " Kg" + "\n" 
					                          + "Tu peso en la Tierra es: " + gMt + " Kg" + "\n"
					                          + "Tu peso en Marte es: " + gMm + " Kg" + "\n"
					                          + "Tu peso en Jupiter es: " + gMj + " Kg" + "\n"
					                          + "Tu peso en Saturno es: " + gMs + " Kg" + "\n"
					                          + "Tu peso en Urano es: " + gMu + " Kg" + "\n"
					                          + "Tu peso en Neptuno es: " + gMn + " Kg" + "\n");
		}
		if (opUsuario==2) {
			//gravedad de venus: 8.87m/s^2
			double venus = 8.87;
			//venus a mercurio g=3,7
			double gVM = masa*3.7/venus;
			//Venus a tierra   g=9,8
			double gVt = masa*9.8/venus;
			//venus a marte   g=3.7
			double gVm = masa*3.7/venus;
			//venus a jupiter   g=24,79
			double gVj = masa*24.79/venus;
			//venus a saturno   g=10,44
			double gVs = masa*10.44/venus;
			//venus a urano   g=8,87
			double gVu = masa*8.87/venus;
			//venus a neptuno   g=11,15
			double gVn = masa*11.15/venus;
			JOptionPane.showMessageDialog(null, "Tu peso en Mercurio es: " + gVM + " Kg" + "\n"
					                          + "Tu peso en Venus es: " + masa + " Kg" + "\n" 
					                          + "Tu peso en la Tierra es: " + gVt + " Kg" + "\n"
					                          + "Tu peso en Marte es: " + gVm + " Kg" + "\n"
					                          + "Tu peso en Jupiter es: " + gVj + " Kg" + "\n"
					                          + "Tu peso en Saturno es: " + gVs + " Kg" + "\n"
					                          + "Tu peso en Urano es: " + gVu + " Kg" + "\n"
					                          + "Tu peso en Neptuno es: " + gVn + " Kg" + "\n");
		}
		if (opUsuario==3) {
			//gravedad de la tierra: 9,8m/s^2
			double tierra = 9.8;
			//tierra a mercurio g=3,7
			double gTM = masa*3.7/tierra;
			//tierra a venus g=8,87
			double gTv = masa*8.87/tierra;
			//tierra a marte   g=3.7
			double gTm = masa*3.7/tierra;
			//tierra a jupiter   g=24,79
			double gTj = masa*24.79/tierra;
			//tierra a saturno   g=10,44
			double gTs = masa*10.44/tierra;
			//tierra a urano   g=8,87
			double gTu = masa*8.87/tierra;
			//tierra a neptuno   g=11,15
			double gTn = masa*11.15/tierra;
			JOptionPane.showMessageDialog(null, "Tu peso en Mercurio es: " + gTM + " Kg" + "\n"
					                          + "Tu peso en Venus es: " + gTv + " Kg" + "\n" 
					                          + "Tu peso en la Tierra es: " + masa + " Kg" + "\n"
					                          + "Tu peso en Marte es: " + gTm + " Kg" + "\n"
					                          + "Tu peso en Jupiter es: " + gTj + " Kg" + "\n"
					                          + "Tu peso en Saturno es: " + gTs + " Kg" + "\n"
					                          + "Tu peso en Urano es: " + gTu + " Kg" + "\n"
					                          + "Tu peso en Neptuno es: " + gTn + " Kg" + "\n");
		}
		

		if (opUsuario==4) {
			//gravedad de marte: 3,7m/s^2
			double marte = 3.7;
			//marte a mercurio g=3,7
			double gMM = masa*3.7/marte;
			//marte a venus g=8,87
			double gMv = masa*8.87/marte;
			//marte a jupiter  g=24,79
			double gMj = masa*24.79/marte;
			//marte a la tierra   g=9,8
			double gMt = masa*9.8/marte;
			//marte a saturno   g=10,44
			double gMs = masa*10.44/marte;
			//marte a urano   g=8,87
			double gMu = masa*8.87/marte;
			//marte a neptuno   g=11,15
			double gMn = masa*11.15/marte;
			JOptionPane.showMessageDialog(null, "Tu peso en Mercurio es: " + gMM + " Kg" + "\n"
					                          + "Tu peso en Venus es: " + gMv + " Kg" + "\n" 
					                          + "Tu peso en la Tierra es: " + gMt + " Kg" + "\n"
					                          + "Tu peso en Marte es: " + masa + " Kg" + "\n"
					                          + "Tu peso en Jupiter es: " + gMj + " Kg" + "\n"
					                          + "Tu peso en Saturno es: " + gMs + " Kg" + "\n"
					                          + "Tu peso en Urano es: " + gMu + " Kg" + "\n"
					                          + "Tu peso en Neptuno es: " + gMn + " Kg" + "\n");
		}
		if (opUsuario==5) {
			//gravedad de jupiter: 24,79m/s^2
			double jupiter = 24.79;
			//jupiter a mercurio g=3,7
			double gJM = masa*3.7/jupiter;
			//jupiter a venus g=8,87
			double gJv = masa*8.87/jupiter;
			//jupiter a marte  g=3,7
			double gJm = masa*3.7/jupiter;
			//jupiter a la tierra   g=9,8
			double gJt = masa*9.8/jupiter;
			//jupiter a saturno   g=10,44
			double gJs = masa*10.44/jupiter;
			//jupiter a urano   g=8,87
			double gJu = masa*8.87/jupiter;
			//jupiter a neptuno   g=11,15
			double gJn = masa*11.15/jupiter;
			JOptionPane.showMessageDialog(null, "Tu peso en Mercurio es: " + gJM + " Kg" + "\n"
					                          + "Tu peso en Venus es: " + gJv + " Kg" + "\n" 
					                          + "Tu peso en la Tierra es: " + gJt + " Kg" + "\n"
					                          + "Tu peso en Marte es: " + gJm + " Kg" + "\n"
					                          + "Tu peso en Jupiter es: " + masa + " Kg" + "\n"
					                          + "Tu peso en Saturno es: " + gJs + " Kg" + "\n"
					                          + "Tu peso en Urano es: " + gJu + " Kg" + "\n"
					                          + "Tu peso en Neptuno es: " + gJn + " Kg" + "\n");
		}
		if (opUsuario==6) {
			//gravedad de saturno: 10,44m/s^2
			double saturno = 10.44;
			//saturno a mercurio g=3,7
			double gSM = masa*3.7/saturno;
			//saturno a venus g=8,87
			double gSv = masa*8.87/saturno;
			//saturno a marte   g=3.7
			double gSm = masa*3.7/saturno;
			//saturno a la tierra   g=9,8
			double gSt = masa*9.8/saturno;
			//saturno a jupiter   g=24,79
			double gSj = masa*24.79/saturno;
			//saturno a urano   g=8,87
			double gSu = masa*8.87/saturno;
			//saturno a neptuno   g=11,15
			double gSn = masa*11.15/saturno;
			JOptionPane.showMessageDialog(null, "Tu peso en Mercurio es: " + gSM + " Kg" + "\n"
					                          + "Tu peso en Venus es: " + gSv + " Kg" + "\n" 
					                          + "Tu peso en la Tierra es: " + gSt + " Kg" + "\n"
					                          + "Tu peso en Marte es: " + gSm + " Kg" + "\n"
					                          + "Tu peso en Jupiter es: " + gSj + " Kg" + "\n"
					                          + "Tu peso en Saturno es: " + masa + " Kg" + "\n"
					                          + "Tu peso en Urano es: " + gSu + " Kg" + "\n"
					                          + "Tu peso en Neptuno es: " + gSn + " Kg" + "\n");
		}
		if (opUsuario==7) {
			//gravedad de urano: 8,87m/s^2
			double urano = 8.87;
			//urano a mercurio g=3,7
			double gUM = masa*3.7/urano;
			//urano a venus g=8,87
			double gUv = masa*8.87/urano;
			//urano a marte   g=3.7
			double gUm = masa*3.7/urano;
			//urano a la tierra   g=9,8
			double gUt = masa*9.8/urano;
			//urano a jupiter   g=24,79
			double gUj = masa*24.79/urano;
			//urano a saturno   g=10,44
			double gUs = masa*10.44/urano;
			//urano a neptuno   g=11,15
			double gUn = masa*11.15/urano;
			JOptionPane.showMessageDialog(null, "Tu peso en Mercurio es: " + gUM + " Kg" + "\n"
					                          + "Tu peso en Venus es: " + gUv + " Kg" + "\n" 
					                          + "Tu peso en la Tierra es: " + gUt + " Kg" + "\n"
					                          + "Tu peso en Marte es: " + gUm + " Kg" + "\n"
					                          + "Tu peso en Jupiter es: " + gUj + " Kg" + "\n"
					                          + "Tu peso en Saturno es: " + gUs + " Kg" + "\n"
					                          + "Tu peso en Urano es: " + masa + " Kg" + "\n"
					                          + "Tu peso en Neptuno es: " + gUn + " Kg" + "\n");
		}
		if (opUsuario==8) {
			//gravedad de neptuno: 11,15m/s^2
			double neptuno = 11.15;
			//neptuno a mercurio g=3,7
			double gNM = masa*3.7/neptuno;
			//neptuno a venus g=8,87
			double gNv = masa*8.87/neptuno;
			//neptuno a marte   g=3.7
			double gNm = masa*3.7/neptuno;
			//neptuno a la tierra   g=9,8
			double gNt = masa*9.8/neptuno;
			//neptuno a jupiter   g=24,79
			double gNj = masa*24.79/neptuno;
			//neptuno a saturno   g=10,44
			double gNs = masa*10.44/neptuno;
			//neptuno a urano   g=8,87
			double gNu = masa*8.87/neptuno;
			JOptionPane.showMessageDialog(null, "Tu peso en Mercurio es: " + gNM + " Kg" + "\n"
					                          + "Tu peso en Venus es: " + gNv + " Kg" + "\n" 
					                          + "Tu peso en la Tierra es: " + gNt + " Kg" + "\n"
					                          + "Tu peso en Marte es: " + gNm + " Kg" + "\n"
					                          + "Tu peso en Jupiter es: " + gNj + " Kg" + "\n"
					                          + "Tu peso en Saturno es: " + gNs + " Kg" + "\n"
					                          + "Tu peso en Urano es: " + gNu + " Kg" + "\n"
					                          + "Tu peso en Neptuno es: " + masa + " Kg" + "\n");
		}

	}

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parchisandfriends;

import java.util.logging.Level;
import java.util.logging.Logger;
import static parchisandfriends.Tablero.BuscarPorNum;
import static parchisandfriends.Tablero.botonesDados;
import static parchisandfriends.Tablero.dado1Select;
import static parchisandfriends.Tablero.dado2Select;
import static parchisandfriends.Tablero.info;
import static parchisandfriends.Tablero.llegada;
import static parchisandfriends.Tablero.valorDados;

/**
 *
 * @author ASUS TUF GAMING F15
 */
public class HiloFicha extends Thread {

    ficha ficha;
    int valor;

    public HiloFicha(ficha ficha, int valor) {
        this.ficha = ficha;
        this.valor = valor;
    }

    @Override
    public void run() {
        int posActual = ficha.casilla;
        NodoPadre casillaInicio = BuscarPorNum(posActual);
        int destinoFinal = posActual + valor;
        int destinoTemp = posActual + valor;
        NodoPadre casillaFin;

//        if(casillaInicio.entrada=true && casillaInicio.color== ficha.getColor()){
//            destino= (posActual*10) + valor;
//        }
        switch (ficha.getColor()) {
            case 1:
                if (posActual <= 64) {
                    if (destinoFinal > 64) {
                        int casillaDentro = (posActual + valor) - 64;
                        destinoFinal = (64 * 10) + casillaDentro;
                        ficha.enPasillo = true;
                        System.out.println("FICHA EN PASILLO: " + ficha.enPasillo);
                    }
                }
                break;
            case 2:
                if (posActual <= 47) {
                    if (destinoFinal > 47) {
                        int casillaDentro = (posActual + valor) - 47;
                        destinoFinal = (47 * 10) + casillaDentro;
                        ficha.enPasillo = true;
                        System.out.println("FICHA EN PASILLO: " + ficha.enPasillo);
                    }
                }
                break;
            case 3:
                if (posActual <= 30) {
                    if (destinoFinal > 30) {
                        int casillaDentro = (posActual + valor) - 30;
                        destinoFinal = (30 * 10) + casillaDentro;
                        ficha.enPasillo = true;
                        System.out.println("FICHA EN PASILLO: " + ficha.enPasillo);
                    }
                }
                break;
            case 4:
                if (posActual <= 13) {
                    if (destinoFinal > 13) {
                        int casillaDentro = (posActual + valor) - 13;
                        destinoFinal = (13 * 10) + casillaDentro;
                        ficha.enPasillo = true;
                        System.out.println("FICHA EN PASILLO: " + ficha.enPasillo);
                    }
                }
                break;
        }
        if (ficha.getColor() != 1 && destinoFinal > 68 && !ficha.enPasillo) {
            destinoFinal = destinoFinal - 68;
        }
        System.out.println(destinoFinal);
        System.out.println("Casilla final: " + destinoFinal);
        casillaFin = BuscarPorNum(destinoFinal);
        casillaInicio.cantFichas.remove(ficha);
        if (casillaFin != null) {
            if (puedeMover(casillaFin)) {
                dadoOff();
                for (int i = posActual; i <= destinoTemp; i++) {
                    NodoPadre temp;
                    if (i > 68 && !ficha.enPasillo) {
                        temp = BuscarPorNum(i - 68);
                        System.out.println("mayor que 68 entonces casilla: " + (i - 68));
                        ficha.dioVuelta = true;
                    } else {
                        temp = BuscarPorNum(i);
                        System.out.println("No mayor que 68 entonces casilla: " + (i));
                    }
                    switch (ficha.getColor()) {
                        case 1:

                            if (ficha.enPasillo & i > 64 && i < 100) {
                                int casillaPasillo = 640 + (i - 64);
                                temp = BuscarPorNum(casillaPasillo);
                                System.out.println("Accede a sw y casilla es: " + casillaPasillo);
                                if (casillaPasillo == 648) {
                                    ficha.disponible = 2;
                                    info.setText("¡Y una más para dentro!");
                                }
                            }
                            break;
                        case 2:
                            if (ficha.enPasillo && i > 47 && i < 100) {
                                int casillaPasillo = 470 + (i - 47);
                                temp = BuscarPorNum(casillaPasillo);
                                System.out.println("Accede a sw y casilla es: " + casillaPasillo);
                                if (casillaPasillo == 478) {
                                    ficha.disponible = 2;
                                    info.setText("¡Y una más para dentro!");
                                }
                            }
                            break;
                        case 3:
                            if (ficha.enPasillo && i > 30 && i < 100) {
                                int casillaPasillo = 300 + (i - 30);
                                temp = BuscarPorNum(casillaPasillo);
                                System.out.println("Accede a sw y casilla es: " + casillaPasillo);
                                if (casillaPasillo == 308) {
                                    ficha.disponible = 2;
                                    info.setText("¡Y una más para dentro!");
                                }
                            }
                            break;

                        case 4:
                            if (ficha.enPasillo && i > 13 && i < 100) {
                                int casillaPasillo = 130 + (i - 13);
                                temp = BuscarPorNum(casillaPasillo);
                                System.out.println("Accede a sw y casilla es: " + casillaPasillo);
                                if (casillaPasillo == 138) {
                                    ficha.disponible = 2;
                                    info.setText("¡Y una más para dentro!");
                                }
                            }
                            break;
                    }

                    ficha.setPos(temp.centroX, temp.centroY, true, temp.dondeSumar, true, true);
                    try {
                        Thread.sleep(150);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                ficha.casilla = casillaFin.numero;
                if (casillaFin.seguro) {
                    System.out.println("NO ES SEGURA " + casillaFin.cantFichas.size());
                    if (casillaFin.cantFichas.size() == 1) {
                        System.out.println("entra");
                        if (ficha.getColor() == casillaFin.cantFichas.get(0).getColor()) {
                            System.out.println("iguales");
                            ficha.setPos(casillaFin.centroX, casillaFin.centroY, true, casillaFin.dondeSumar, false, false);
                            casillaFin.cantFichas.add(ficha);
                        } else {
                            System.out.println("distintas");
                            ficha matar = casillaFin.cantFichas.get(0);
                            matar.encarcelar();
                            System.out.println("Mata");
                            casillaFin.cantFichas.remove(0);
                            ficha.setPos(casillaFin.centroX, casillaFin.centroY, true, casillaFin.dondeSumar, true, false);
                            casillaFin.cantFichas.add(ficha);
                        }
                    } else if (casillaFin.cantFichas.isEmpty()) {
                        casillaFin.cantFichas.add(ficha);
                        ficha.setPos(casillaFin.centroX, casillaFin.centroY, true, casillaFin.dondeSumar, true, false);
                    }

                } else {
                    System.out.println("SEGURA " + +casillaFin.cantFichas.size());
                    if (casillaFin.cantFichas.size() == 1) {

                        ficha.setPos(casillaFin.centroX, casillaFin.centroY, true, casillaFin.dondeSumar, false, false);
                        casillaFin.cantFichas.add(ficha);

                    } else if (casillaFin.cantFichas.isEmpty()) {
                        ficha.setPos(casillaFin.centroX, casillaFin.centroY, true, casillaFin.dondeSumar, true, false);
                        casillaFin.cantFichas.add(ficha);
                    }

                }
            } else {
                info.setText("<html>Me parece que no puedes moverte hacia allí!<html>");

            }
            if (llegada.isEmpty() &&   ficha.getOwner().gana()) {
                quote q = new quote(0);
                q.setVisible(true);
                
            }
        }else{
            info.setText("<html>Te pasas nico, te pasas<html>");

            
        }
    }

    public boolean puedeMover(NodoPadre casFin) {
        if (!casFin.llegada) {
            if (casFin.cantFichas.size() < 2) {
                return true;
            }
        } else {
            return true;
        }
        return false;

    }

    public void dadoOff() {
        valorDados = 0;
        if (dado1Select != -1) {
            botonesDados.get(dado1Select).setEnabled(false);
            botonesDados.get(dado1Select).setSelected(false);
            dado1Select = -1;
        }
        if (dado2Select != -1) {
            botonesDados.get(dado2Select).setEnabled(false);
            botonesDados.get(dado2Select).setSelected(false);
            dado2Select = -1;
        }
    }
}

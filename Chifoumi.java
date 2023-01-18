import java.util. Scanner;
public class Chifoumi 
{public static void main(String args[])
    {int c,o,compt,comptordi;
        //initialisation des compteur de points
        compt=0;
        comptordi=0;
        Scanner sc = new Scanner(System.in);

        do
        {
            // choix pierre feuille ciseaux par le joueur puis par l'ordi
            System.out.println("1=Pierre; 2=Papier; 3=Ciseaux");
            c=sc.nextInt();;
            o=(int)(1+(4-1)*Math.random());

            //Combinaison de jeu
            if(c==o){System.out.println("Égalité");}

            //Quand l'ordi fait pierre
            else if(o==1 && c==2)
            {
                System.out.println("J'ai fait pierre vous avez fait ciseaux, vous avez gagnez");
                compt+=1;
            }
            else if(o==1 && c==3)
            {
                System.out.println("J'ai fait pierre vous avez fait ciseaux, vous avez perdu");
                comptordi+=1;
            }

            //Quand l'ordi fait feuille
            else if(o==2 && c==1)
            {
                System.out.println("J'ai fait feuille vous avez fait pierre, vous avez perdu");
                comptordi+=1;
            }
            else if(o==2 && c==3)
            {
                System.out.println("J'ai fait feuille vous avez fait ciseaux, vous avez gagnez");
                compt+=1;
            }

            //Quand l'ordi fait ciseaux
            else if(o==3 && c==1)
            {
                System.out.println("J'ai fait ciseaux vous avez fait Pierre, vous avez gagnez");
                compt+=1;
            }
            else if(o==3 && c==2)
            {
                System.out.println("J'ai fait ciseaux vous avez fait feuille, vous avez perdu");
                compt+=1;
            }
            System.out.println("Score:"+compt+"-"+comptordi);

        }
        while((compt<5) && (comptordi<5));

        //Print le gagnant
        if(compt>comptordi)
        {
            System.out.println("Vous avez gagnez🥳🎉🍾");
            System.out.println("Score:"+compt+"et"+comptordi);
        }
        else
        {
            System.out.println("Vous avez perdu 😭🥶💀");
            System.out.println("Score:"+comptordi+"et"+compt);
        }

    }
    
}

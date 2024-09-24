package fichier

import com.strumenta.kotlinmultiplatform.errMessage
import java.io.File

fun main() {
    // Tu peux tester tes fonctions en les appellants ici.
    lire()
    val args = arrayOf("pipo.txt")
    val result = ecrire(args)
    println("\n\n $result")

}

/**
 * (1 point) Affiche dans la console le contenu du fichier message.txt qui se trouve dans le projet de départ.
 */
fun lire() {
val fichier: File = File("message.txt")
    val textMessage: String = fichier.readText()
    println(textMessage)

}

/**
 * (1 point) S’il n’y a pas 2 éléments dans le paramètre args, affiche un message d'erreur, et retourne la valeur -1.
 * (1 point) Crée un fichier dans le répertoire du projet, dont le nom sera déterminé par le premier argument.
 *           Par exemple, si l’argument est « pipo.txt » l’application crée le fichier dans le dossier du projet avec le
 *           nom « pipo.txt ».
 * (1 point) Le fichier aura comme contenu le texte contenu dans le 2ème élément qui est dans le paramètre args.
 * Si tout s'est bien passé, on retourne la valeur 1.
 */
fun ecrire(args: Array<String>): Int {
    var nomFichier: String = args[0]

    var fichier: File =File(nomFichier)
    if (args.count() <2){
        println("Merci de donne 2 arg valide")
        return -1

    }

    val contenu: String = args[1]
    fichier.printWriter().use { out ->
        out.println(contenu)
        return 1
    }

}
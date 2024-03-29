package kotlinlistener

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("kotlinlistener")
                .mainClass(Application.javaClass)
                .start()
    }
}
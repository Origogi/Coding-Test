package hackerrank.test

fun main() {
    validateAddresses(arrayOf("12.008.254.148"))
}

fun validateAddresses(addresses: Array<String>): Array<String> {
    val ans =  addresses.map { addr ->

        val hasDot = addr.contains('.')
        val hasColon = addr.contains(':')

        if (hasDot && hasColon) {
            "Neither"
        } else if (hasDot) {
            if (checkIPv4(addr)) {
                "IPv4"
            } else {
                "Neither"
            }
        }
        else if (hasColon){
            if (checkIPv6(addr)) {
                "IPv6"
            } else {
                "Neither"
            }
        } else {
            "Neither"
        }

    }
    return ans.toTypedArray()

}

fun checkIPv6(addr: String): Boolean {
    val doubleColon = addr.replace("::", "_").filter { it == '_' }.count()

    if (doubleColon >1) {
        return false
    }

    val tokens = addr.split(":").filter { it.isNotEmpty() }

    if (doubleColon == 0 && tokens.size !=8) {
        return false
    }

    for (token in tokens) {
        if (token.filter { it > 'f' }.count() > 0) {
            return false
        }
    }

    return true

}

fun checkIPv4(addr: String): Boolean {
    if (addr[0] == '.' || addr.last() == '.') {
        return false
    }

    val tokens = addr.split(".").filter { it.isNotEmpty() }

    if (tokens.size !=4) {
        return false
    }

    for (token in tokens) {
        if (token.isBlank()) {
            return false
        }

        if (token.length > 3) {
            return false
        }

        val intValue = token.toInt()

        if (intValue !in 0 .. 255) {
            return false
        }

        if (token[0] == '0') {
            val octVal = token.substring(1).let {
                if (it.isBlank()) {
                    0
                } else {
                    it.toInt()
                }
            }

            if (octVal > 7) {
                return false
            }
        }
    }

    return true
}
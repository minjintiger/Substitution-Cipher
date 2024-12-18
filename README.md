# Substitution-Cipher

This is a program that uses encryption and decryption method of substitution cipher.
Substitution cipher uses a set of characters for permutation to encrypt and to decrypt.
When it encrypts, it uses a set of permutation and substitute each characters to each characters in the set of permutation.
When it decrypts, it uses inverse of a set of permutation that was used in encryption, and do same steps.

Example(Encryption)

    Input: I LOVE YOU

    Key: 
        A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
        D P R M O L T Z S G Q J U W F I E B A C V K Y X H N
    
    Encryption: 
                I -> S      E -> O
                L -> J      Y -> H
                O -> F      O -> F
                V -> K      U -> V

    Output: S J F K O H F V

Example(Decryption)

    Input: S J F K O H F V

    Key: (inverse of the permutation used in encryption above.)
        A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
        S R P A Q O J Y P L V F D Z E B K C I G M U N X W H
    
    Encryption: 
                I -> S      E -> O
                L -> J      Y -> H
                O -> F      O -> F
                V -> K      U -> V

    Output: S J F K O H F V

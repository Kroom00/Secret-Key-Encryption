# README
# Secret-Key-Encryption

## Contents

1. [Introduction](#introduction)
2. [Tasks Overview](#tasks-overview)
    - [Task 2: Encryption using Different Ciphers and Modes](#task-2-encryption-using-different-ciphers-and-modes)
    - [Task 3: Encryption Mode – ECB vs. CBC](#task-3-encryption-mode--ecb-vs-cbc)
    - [Task 7: Programming using the Crypto Library (Java)](#task-7-programming-using-the-crypto-library-java)
3. [Lab Observations](#lab-observations)
4. [Challenges](#challenges)
5. [Conclusion](#conclusion)
6. [References](#references)

## Introduction

In this lab, we explored various aspects of secret-key encryption, delving into encryption algorithms, encryption modes, paddings, and initial vectors (IV). The primary focus was on gaining hands-on experience with encryption techniques and understanding common mistakes in their implementation. The lab tasks covered key topics such as substitution ciphers, frequency analysis, encryption modes (specifically ECB vs. CBC), and programming using the crypto library. The tasks were designed to deepen our understanding of secret-key encryption and its practical applications.

## Tasks Overview

### Task 2: Encryption using Different Ciphers and Modes

In this task, we experimented with different encryption algorithms and modes. We used tools like OpenSSL to encrypt messages with AES, DES, and other ciphers. The objective was to understand how different algorithms and modes affect the security and confidentiality of the encrypted data.

Encryption And Decryption using CBC Mode:

![image](https://github.com/Kroom00/Secret-Key-Encryption/assets/88386673/b78e69ea-a5bb-44ec-9acf-f5898b954cde)



Encryption And Decryption using CFB Mode: 

![image](https://github.com/Kroom00/Secret-Key-Encryption/assets/88386673/d9f72500-235f-422e-b9bc-be005a47456a)



Encryption And Decryption using ECB Mode:

![image](https://github.com/Kroom00/Secret-Key-Encryption/assets/88386673/97b4e64d-34c4-4a45-84ca-51f9c8f31ca2)





### Task 3: Encryption Mode – ECB vs. CBC

Task 3 focused on comparing two encryption modes: Electronic Code Book (ECB) and Cipher Block Chaining (CBC). We encrypted a picture using both modes and observed the differences. This task provided insights into the importance of choosing the right encryption mode for different scenarios.


Encryption using ECB Mode:

![image](https://github.com/Kroom00/Secret-Key-Encryption/assets/88386673/d32523eb-4207-4046-984b-5dcd49445902)






Encryption using CBC Mode:

![image](https://github.com/Kroom00/Secret-Key-Encryption/assets/88386673/cf4b5d25-8cdb-47a8-b966-ca481e15682f)





### Task 7: Programming using the Crypto Library (Java)

- Developed a Java program named KeyFinder to decrypt a given ciphertext using a wordlist-based key search.
- Utilized the Java Crypto library to implement AES decryption in CBC mode with PKCS5Padding.
- Integrated error handling for potential key mismatches and implemented key generation logic.
- Tested the program on the provided Ubuntu VM, ensuring compatibility with the specified environment.

  ![image](https://github.com/Kroom00/Secret-Key-Encryption/assets/88386673/ee91c62a-406e-4e6d-8cd1-c7a89cb8371e)


## Lab Observations

### Encryption with Different Ciphers:

- Noticed variations in encryption speed and complexity across DES, AES, and Blowfish.
- Explored the impact of key size on security and performance.

### ECB vs. CBC Encryption Modes:

- Identified patterns in ciphertext generated using ECB and CBC modes.
- Noted that ECB does not provide as much diffusion as CBC, leading to potential vulnerabilities.
- Discussed the importance of initialization vectors (IVs) in CBC mode.

### Java Crypto Library Programming:

- Successfully implemented a Java program for AES decryption using a wordlist-based key search.
- Handled potential exceptions, including BadPaddingException for incorrect keys.
- Demonstrated the effectiveness of the program in finding the correct key from the provided wordlist.

## Challenges

- Sharing Files Between Windows and Ubuntu in a Virtual Machine
- Using Command-Line to run the code

## Conclusion

In this lab, we explored various encryption tasks, including using different ciphers and modes, comparing ECB vs. CBC encryption, and programming in Java with the Crypto library. The hands-on experience provided valuable insights into the strengths and weaknesses of different encryption techniques. The Java program, KeyFinder, demonstrated practical implementation skills in cryptography, showcasing the importance of key management and encryption mode selection.

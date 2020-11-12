# JASYPT ENCRYPTOR / DECRYPTOR

## 1 - Encrypt
The API uses `PBEWithMD5AndTripleDES` as an Encryption algorithm

`POST : https://jasypt.herokuapp.com/encrypt`

```
{
	"input": "titi",
	"password":"toto"
}
```
`RESPONSE : ArqZodcqzxYozbGV7rihGQ==`

## 2 - Decrypt

`POST : https://jasypt.herokuapp.com/decrypt`

```
{
	"input": "ArqZodcqzxYozbGV7rihGQ==",
	"password":"toto"
}
```
`RESPONSE : titi`

# JASYPT ENCRYPTOR / DECRYPTOR

The API uses PBEWithMD5AndTripleDES

`POST : https://jasypt.herokuapp.com/encrypt`

```
{
	"input": "titi",
	"password":"toto"
}
```
`RESPONSE : ArqZodcqzxYozbGV7rihGQ==`


`POST : https://jasypt.herokuapp.com/decrypt`

```
{
	"input": "ArqZodcqzxYozbGV7rihGQ==",
	"password":"toto"
}
```
`RESPONSE : titi`
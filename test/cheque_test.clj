(ns cheque-test
  (:use clojure.test cheque)
  )

(deftest chequeDezReais
  (testing "should return dez reais when pass 10"
    (is (= (humanizeWithCurrency 10) "dez reais"))))

(deftest chequeOnzeReais
  (testing "should return onze reais when pass 11"
    (is (= (humanizeWithCurrency 11) "onze reais"))))

(deftest chequeVinteUmReais
  (testing "should return vinte e um reais when pass 21"
    (is (= (humanizeWithCurrency 21) "vinte e um reais"))))

(deftest chequeTrintaDoisReais
  (testing "should return trinta e dois reais when pass 32"
    (is (= (humanizeWithCurrency 32) "trinta e dois reais"))))

(deftest chequeCinquentaReais
  (testing "should return cinquenta reais when pass 50"
    (is (= (humanizeWithCurrency 50) "cinquenta reais"))))

(deftest chequeTrezentosOitentaReais
  (testing "should return trezentos e oitenta reais when pass 380"
    (is (= (humanizeWithCurrency 380) "trezentos e oitenta reais"))))

(deftest chequeNovecentosNoventaNoveReais
  (testing "should return novecentos e noventa e nove reais when pass 999"
    (is (= (humanizeWithCurrency 999) "novecentos e noventa e nove reais"))))

(deftest chequeQuinzeMilQuatrocentosVinteReais
  (testing "should return quinze mil e quatrocentos e vinte reais when pass 15420"
    (is (= (humanizeWithCurrency 15420) "quinze mil e quatrocentos e vinte reais"))))

(deftest chequeVinteMilReais
  (testing "should return vinte mil reais when pass 20000"
    (is (= (humanizeWithCurrency 20000) "vinte mil reais"))))

(deftest chequeCemReais
  (testing "should return cem reais when pass 100"
    (is (= (humanizeWithCurrency 100) "cem reais"))))

(deftest chequeCemReaisDezCentavos
  (testing "should return cem reais e dez centavos when pass 100.10"
    (is (= (humanizeWithCurrency 100.10) "cem reais e dez centavos"))))

(deftest chequeUmReal
  (testing "should return um real when pass 1"
    (is (= (humanizeWithCurrency 1) "um real"))))

(deftest chequeMenosCemReais
  (testing "should return menos cem reais when pass -100"
    (is (= (humanizeWithCurrency -100) "menos cem reais"))))

(deftest chequeDezReaisCincoCentavos
  (testing "should return dez reais e cinco centavos when pass 10.05"
    (is (= (humanizeWithCurrency 10.05) "dez reais e cinco centavos"))))

(deftest chequeVinteCincoCentavos
  (testing "should return vinte e cinco centavos when pass 0.25"
    (is (= (humanizeWithCurrency 0.25) "vinte e cinco centavos"))))

(deftest chequeZero
  (testing "should return nothing when pass 0"
    (is (= (humanizeWithCurrency 0) ""))))

(deftest chequeUmCentavo
  (testing "should return um centavo when pass 0.01"
    (is (= (humanizeWithCurrency 0.01) "um centavo"))))

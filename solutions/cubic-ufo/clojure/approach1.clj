
(def TestCases (read-string(read-line)))

(dotimes [i TestCases]

(def A (read-string(read-line)))

    (if (<= A (Math/sqrt 2)) 
      (do
        (def operationAsin (/ (- (Math/pow A 2) 1) 2) )
        (def theta (Math/asin operationAsin))
        ; (println operationAsin)
        ; (println theta)
        (println "0.5, 0, 0")
        (println "0, "(* 0.5 (Math/cos theta))", "(* 0.5 (Math/sin theta)))
        (println "0, "(* -0.5 (Math/sin theta))", "(* 0.5 (Math/cos theta)))
        ; (def theta (asin ()))
      )
      (do
        (def thi (- 
                    (Math/asin (/ A (Math/sqrt 3))) 
                    (Math/asin (/ (Math/sqrt 2) (Math/sqrt 3)))   
                 )
        )
        ; (println "thi: "thi) 
        (println ""(/ (Math/cos thi) 2)", "(/ (Math/sin thi) 2)", 0")
        (println ""(/ (* -1 (Math/sin thi)) (Math/sqrt 8))", "(/ (Math/cos thi) (Math/sqrt 8))", "(/ 1 (Math/sqrt 8)))
        (println ""(/ (Math/sin thi) (Math/sqrt 8))", "(/ (* -1 (Math/cos thi)) (Math/sqrt 8))", "(/ 1 (Math/sqrt 8)))
      )


    )
)





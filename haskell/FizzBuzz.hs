module FizzBuzz where

guarding :: Int -> String
guarding number
  | number `mod` 15 == 0 = "FizzBuzz"
  | number `mod` 3  == 0 = "Fizz"
  | number `mod` 5  == 0 = "Buzz"
  | otherwise            = show number


matching :: Int -> String
matching number = aux (number `mod` 3) (number `mod` 5)
  where aux 0 0 = "FizzBuzz"
        aux 0 _ = "Fizz"
        aux _ 0 = "Buzz"
        aux _ _ = show number


compositing :: Int -> String
compositing = aux . (`map` [show, make 3 "Fizz", make 5 "Buzz"]) . flip ($)
  where make number word = (["",word] !!) . fromEnum . (== 0) . (`mod` number)
        aux (n:r) = [fb,n] !! (fromEnum ("" == fb)) where fb = foldr1 (++) r


zipping :: Int -> String
zipping index = [guarding number | number <- [0..]] !! index

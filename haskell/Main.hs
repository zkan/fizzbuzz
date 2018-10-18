import FizzBuzz


sayFirstFew :: Int -> IO ()
sayFirstFew n = do
    putStr "I'm gonna say fizz-buzz from 1 to "
    putStr $ show n
    putStrLn ":"
    mapM_ putStrLn (map guarding [1..n])
    putStrLn ""


confirmSamples :: Int -> IO ()
confirmSamples n = do
    putStrLn "Those 3 methods from FizzBuzz module produce the same output?"
    let sampleGuard = map guarding [0..n]
        sampleMatch = map matching [0..n]
        sampleComposite = map compositing [0..n]
        eq3 (x,y,z) = x == y && y == z
        validity = all eq3 $ zip3 sampleGuard sampleMatch sampleComposite
    putStrLn $ show validity
    putStrLn ""


main :: IO ()
main = do
    sayFirstFew 15
    confirmSamples 1000

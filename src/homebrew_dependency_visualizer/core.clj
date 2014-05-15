(ns homebrew-dependency-visualizer.core
  (:require [clojure.java.shell :as shell :only [sh]]
            [clojure.string :as str :only [join trim-newline]])
  (:import java.io.IOException))
(use '[print.foo])

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn brew-executible
  "find the absolute location of the brew executible"
  []
  (let [cmd ["which" "brew"]]
    (let [{:keys [exit out err]} (apply shell/sh cmd)]
      (if (zero? exit)
        (str/trim-newline out)
        (throw (IOException. (str "Couldn't find brew using '"
                                  (str/join " " cmd)
                                  "'. Exit: " exit ", Error:" err)))))))

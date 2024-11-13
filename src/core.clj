(ns core
  (:require [settings :refer [api-key]]
            [prompts :refer [system-prompt, correction-prompt, card-prompt]]
            [clojure.string :as str]
            [wkok.openai-clojure.api :as api]))

(defn load-words []
  (str/replace (slurp "input.txt") "\n" " "))

(defn ask-llm [question]
  (-> (api/create-chat-completion
        {:model "gpt-4o"
         :temperature 0.1
         :messages [{:role "system" :content system-prompt}
                    {:role "user" :content question}]}
        {:api-key api-key})
      :choices first :message :content))

(defn -main []
  (->> (load-words)
       (str correction-prompt " ")
       (ask-llm)
       (str card-prompt " ")
       (ask-llm)
       (spit "output.csv")))

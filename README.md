Некоторые методы не подходят для каждого животного, например такой метод как "fly" не подходит для змеи и для решения данной проблемы такие методы лучше реализововать в классах-наследниках, но тогда возникнет проблема DRY. В таком случае можно попробовать разделить животных
на категории (классы-наслденики): Те, которые умеют только ходить, те, которые умееют только ползать и так далее. 
К примеру так: (если так можно реализовать)
class Animal...
class OnlyCrawling extends Animal...
class Sneak extends OnlyCrawling...

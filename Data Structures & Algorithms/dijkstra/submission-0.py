class Solution:
    def shortestPath(self, n: int, edges: List[List[int]], src: int) -> Dict[int, int]:
       adj = {}
    
       for i in range(n):
           adj[i] = []
       for s,d,w in edges:
           adj[s].append([d,w])
       print(adj)
       short={}
       min_heap = [[0,src]]
       while min_heap:
         w1,n1 = heapq.heappop(min_heap)
         if n1 in short:
           continue
         short[n1] = w1
         for n2,w2 in adj[n1]:
           if n2 not in short:
            heapq.heappush(min_heap,[w1+w2,n2])
       for i in range(n):
          if i not in short:
            short[i] = -1 
       return short

package dev.rabbit.generated;

import java.math.BigInteger;
import java.util.Arrays;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint128;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.9.4.
 */
@SuppressWarnings("rawtypes")
public class LiquidityMathTest extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b506101e3806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c8063402d44fb1461003b578063cf41632f14610086575b600080fd5b61006a6004803603604081101561005157600080fd5b506001600160801b038135169060200135600f0b6100c7565b604080516001600160801b039092168252519081900360200190f35b6100b56004803603604081101561009c57600080fd5b506001600160801b038135169060200135600f0b6100dc565b60408051918252519081900360200190f35b60006100d383836100f7565b90505b92915050565b6000805a90506100ec84846100f7565b505a90039392505050565b60008082600f0b121561015c57826001600160801b03168260000384039150816001600160801b031610610157576040805162461bcd60e51b81526020600482015260026024820152614c5360f01b604482015290519081900360640190fd5b6100d6565b826001600160801b03168284019150816001600160801b031610156100d6576040805162461bcd60e51b81526020600482015260026024820152614c4160f01b604482015290519081900360640190fdfea2646970667358221220bcad3298957b8af577ab97654ad6344234f7306ec81845efc6fd74b43d7f704364736f6c63430007060033";

    public static final String FUNC_ADDDELTA = "addDelta";

    public static final String FUNC_GETGASCOSTOFADDDELTA = "getGasCostOfAddDelta";

    @Deprecated
    protected LiquidityMathTest(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected LiquidityMathTest(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected LiquidityMathTest(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected LiquidityMathTest(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<BigInteger> addDelta(BigInteger x, BigInteger y) {
        final Function function = new Function(FUNC_ADDDELTA, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint128(x), 
                new org.web3j.abi.datatypes.generated.Int128(y)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint128>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> getGasCostOfAddDelta(BigInteger x, BigInteger y) {
        final Function function = new Function(FUNC_GETGASCOSTOFADDDELTA, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint128(x), 
                new org.web3j.abi.datatypes.generated.Int128(y)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    @Deprecated
    public static LiquidityMathTest load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new LiquidityMathTest(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static LiquidityMathTest load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new LiquidityMathTest(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static LiquidityMathTest load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new LiquidityMathTest(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static LiquidityMathTest load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new LiquidityMathTest(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<LiquidityMathTest> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(LiquidityMathTest.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<LiquidityMathTest> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(LiquidityMathTest.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<LiquidityMathTest> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(LiquidityMathTest.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<LiquidityMathTest> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(LiquidityMathTest.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
